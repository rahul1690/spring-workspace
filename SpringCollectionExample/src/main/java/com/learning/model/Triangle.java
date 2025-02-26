package com.learning.model;

import java.util.List;

public class Triangle implements Shape{
	
	List<Point> points;
	

	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}

	@Override
	public void draw() {
		for(Point point:points) {
			System.out.println("Point = X:"+point.getX()+" Y:"+point.getY());
		}
	}
	
	

}
