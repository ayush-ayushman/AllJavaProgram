package com.ty;
public class FabRange {
	public static void main(String[] args) {
		int a=0;
		int b=1;
		int n=50;
		System.out.println(a);
		System.out.println(b);
		for(int i=2;i<20;i++)
		{
			int c=a+b;
			if(c<n)
			   System.out.println(c);
			a=b;
			b=c;
			
		}
	}

}
