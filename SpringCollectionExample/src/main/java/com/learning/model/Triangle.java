package com.learning.model;

import java.util.List;

public class Triangle {
	
	List<Point> points;
	
	public void display(){
		for(Point point:points) {
			System.out.println("Point = X:"+point.getX()+" Y:"+point.getY());
		}
	}

	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}
	
	

}
