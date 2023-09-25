package com.ty;

public class Lcm {
	public static void main(String[] args) {
		int m=10;
		int n=6;
		while(n>0)
		{
			int r=m%n;
			m=n;
			n=r;
		}
		System.out.println(m);
		int p=(10*6/m);
		System.out.println("lcm" +p);
	}

	

}
