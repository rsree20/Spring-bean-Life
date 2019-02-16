package com.controllers;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import com.pojo.Employee;

public class InitHelloWorld implements BeanPostProcessor {

	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		
		if(bean instanceof Employee) {
			Employee e = (Employee)bean;
			System.out.println(e.getCity());
			System.out.println("Do for Employee");
		}
		
		return bean;
	}

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		
		if(bean instanceof Employee) {
			Employee e = (Employee)bean;
			System.out.println(e.getCity());
			System.out.println("Do for Employee");
		}
		return bean;
	}

}
