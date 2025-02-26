package com.learning.client;


import java.beans.BeanProperty;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learning.model.Circle;
import com.learning.model.Point;
import com.learning.model.Triangle;
@Configuration
public class Client {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
//		Triangle triangle = context.getBean("triangle", Triangle.class);
//		
//		triangle.draw();
		
		Circle circle = context.getBean("circle", Circle.class);
		circle.draw();
		
		context.close();
	}
	
	//Above package should be there in Component scan package
	@Bean(name = "circle1")
	public Point point() {
		Point p2 = new Point();
		p2.setX(0);
		p2.setY(0);
		return p2;
	}
}
