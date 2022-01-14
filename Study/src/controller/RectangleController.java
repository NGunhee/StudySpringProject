package controller;

import model.vo.Rectangle;

public class RectangleController {
	
	Rectangle r = new Rectangle();
	
	public String calcArea(int x , int y, int height, int width) {
		r.setX(x); r.setY(y); r.setHeight(height); r.setWidth(width);
		
		return "RectArea= " + r.getHeight()*r.getWidth();
	}
	
	public String calcPerimeter(int x ,int y , int height, int width) {
		r.setX(x); r.setY(y); r.setHeight(height); r.setWidth(width);
		
		return "RectPerimeter= " + 2*(r.getHeight()+r.getWidth());
	}

}
