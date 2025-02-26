package com.learning.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.annotation.Resource;

@Component
public class Circle implements Shape{

	private Point center;

	@Override
	public void draw() {
		System.out.println("Drawing Circle");
		System.out.println("Circle: Point is: ("+center.getX() + ", "+center.getY()+")");
	}

	public Point getCenter() {
		return center;
	}

//	@Resource
	@Autowired
	@Qualifier("circle1")
	public void setCenter(Point center) {
		this.center = center;
	}
	
	@PostConstruct
	public void initializedCircle() {
		System.out.println("Init of Circle");
	}
	
	@PreDestroy
	public void destroyCircle() {
		System.out.println("Destroy of circle");
	}
}
