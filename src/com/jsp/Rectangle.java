package com.jsp;

public class Rectangle implements Shape {
	double l,b;

	public Rectangle(double l, double b) {
		super();
		this.l = l;
		this.b = b;
	}

	@Override
	public double getArea() {
		
		return 2*l*b;
	}

	@Override
	public String toString() {
		return "Rectangle [l=" + l + ", b=" + b + "]";
	}
	
	

}
