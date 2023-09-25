package com.ty;

public class StrongRange {
	public static void main(String[] args) {
		int i;
		
		for( i=1;i<=145;i++)
		{
			int sum=0;
		  	sum=sum+call(i);
		  	
		  	if(sum==i)
		  		System.out.println(i);
		}
	}
	static int call(int s)
	{
		int sum=0;
		while(s>0)
		{
		   int p=s%10;
		   sum=sum+caller(p);
		   s=s/10;
		}
		return sum ;
		
	}
	static int caller(int s)
	{
		int z=1;
		for(int k=1;k<=s;k++)
		{
			z=z*k;
		}
		return z;
		
	}

}
