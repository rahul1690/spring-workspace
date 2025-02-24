package com.learning.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learning.Employee;

public class Client {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		
		Employee emp = ctx.getBean("employee", Employee.class);
		System.out.println(emp);
		
	}

}
