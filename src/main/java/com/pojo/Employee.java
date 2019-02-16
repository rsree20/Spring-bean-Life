package com.pojo;

public class Employee {
	
	Employee() {
		System.out.println("Employee object instantiated!!");
	}
	
	private int empId;
	private String name;
	private String city;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void init() {
		System.out.println("init method triggered!!");
		this.city = "Hyderabad";
	}
	
	public void destroy() {
		System.out.println("destroy method triggered!!");
	}
}
