package com.nasim.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nasim.service.EmpService;

public class App {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("com/nasim/service/beans.xml");
		EmpService emp=(EmpService) context.getBean("service");
		System.out.println(emp.getManager().getName());

	}

}
