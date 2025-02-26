package com.learning.client;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learning.model.Circle;
import com.learning.model.Triangle;

public class Client {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		Triangle triangle = context.getBean("triangle", Triangle.class);
		
		triangle.draw();
		
		Circle circle = context.getBean("circle", Circle.class);
		circle.draw();
		
		context.close();
	}
}
