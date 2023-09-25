package com.jsp;
import java.util.ArrayList;
import java.util.Iterator;
public class Main {
	public static void main(String[] args) {
		ArrayList<Shape> op=new ArrayList<Shape>();
		Shape c=new Circle(3.6);
		Shape r=new Rectangle(4,9);
		Shape sq=new Square(7);
		op.add(c);
		op.add(r);
		op.add(sq);
		Shape t=op.get(0);
		Iterator<Shape> d=op.iterator();
		while(d.hasNext())
		{
			Shape l=d.next();
			if(l.getArea()>t.getArea())
				  t=l;
				
			
		}
		System.out.println("Biggest Shape"+"--->"+t+"Area="+t.getArea());
		
		 
	}
	
	

}
