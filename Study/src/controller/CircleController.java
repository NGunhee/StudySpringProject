package controller;

import model.vo.Circle;

public class CircleController {
	Circle c = new Circle();
	
	public String calcArea(int x, int y, int radius) {
		c.setX(x); c.setY(y); c.setRadius(radius);
		return "circleArea= "+(Math.PI*(double)c.getRadius()*(double)c.getRadius());
	}
	
	public String calcCircum(int x , int y, int radius) {
		c.setX(x); c.setY(y); c.setRadius(radius);
		return "circleCircum= " + (Math.PI*2*(double)c.getRadius());
	}
}
