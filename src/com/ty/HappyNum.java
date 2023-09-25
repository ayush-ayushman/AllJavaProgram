package com.ty;

public class HappyNum {
	public static void main(String[] args) {
		int n=7;
		
		while(n>9)
		{
		    int sum=0;
		    int m=n;
			while(m>0)
			{
				int dig=m%10;
				sum=sum+dig*dig;
				m=m/10;
			}
			n=sum;
			
		}
		if(n==1|| n==7)
			System.out.println("happy no");
		else
			System.out.println("not a happy no");
	}

}
