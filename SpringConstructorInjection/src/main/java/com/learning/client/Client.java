package com.learning.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learning.Employee;

public class Client {

	public static void main(String[] args) {
//		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		ApplicationContext annotationCtx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Employee emp = annotationCtx.getBean("employee", Employee.class);
		System.out.println(emp);
		
	}

}
