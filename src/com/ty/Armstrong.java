package com.ty;

public class Armstrong {
	public static void main(String[] args) {
		int n=153;
		int c1=n;
		int count=0;
		int sum=0;
		while(c1>0)
		{
			int c=c1%10;
			c1=c1/10;
			count++;
			
		}
		while(n>0)
		{
			int d=n%10;
			n=n/10;
			sum=sum+call(d,count);
		}
		System.out.println(sum);
	}
	public static int call(int s,int x)
	{
		int p=1;
		for(int k=1;k<=x;k++)
		{
			p=p*s;
		}
		return p;
		
		
	}

}
