package com.learning.model;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.annotation.Resource;

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

	@Resource
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
