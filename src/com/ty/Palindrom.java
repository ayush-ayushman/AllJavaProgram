package com.ty;

public class Palindrom {
	public static void main(String[] args) {
		int n=787;
		int z=n;
		int sum=0;
		while(n>0)
		{
			int p=n%10;
			sum=sum*10+p;
			n=n/10;
		}
		if(z==sum)
		   System.out.println("palindrom");
	}

}
