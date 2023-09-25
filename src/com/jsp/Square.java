package com.jsp;

public class Square implements Shape{

	
	double r;
	public Square(double r) {
		super();
		this.r = r;
	}

	@Override
	public double getArea() {
		
		return r*r;
	}

	@Override
	public String toString() {
		return "Square [r=" + r + "]";
	}
	

}
