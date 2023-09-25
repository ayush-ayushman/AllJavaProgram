package com.jsp;

public class Circle implements Shape {
    double r;
    
	public Circle(double r) {
		super();
		this.r = r;
	}

	@Override
	public double getArea() {
		
		return r*r*3.14;
	}

	@Override
	public String toString() {
		return "Circle [r=" + r + "]";
	}
	
	

}
