package com.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pojo.Employee;
import com.pojo.Student;

@Controller
public class EmployeeController {

	public EmployeeController() {
		System.out.println("employee controller object created!!");
	}
	@Autowired
	private Employee emp;
	
	@Autowired
	private Student std;
	
	@RequestMapping(value="/testMethod")
	public String testMethod() {
		
		System.out.println(emp.getCity());
		System.out.println(emp.getEmpId());
		System.out.println(emp.getName());
		System.out.println("---------------------------------------------------");
		System.out.println(std.getCollegeName());
		System.out.println(std.getName());
		System.out.println(std.getStdId());
		return "";
	}
}
