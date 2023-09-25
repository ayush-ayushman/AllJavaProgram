package com.ty;

public class Class {
	public static void main(String[] args) {
		int n=317;
		int i;
		for(i=2;i<n;i++)
		{
			if(n%i==0)
				System.out.println("not a prime pali");
				break;
		}
		if(i==n)
		{
			i=call(n);
			System.out.println("prime plindrom");
			
		}
				
	}

	public static int call(int c)
	{
		int sum=0;
		while(c>0)
		{
			int dig=c%10;
			c=c/10;
			sum=sum*10+dig;
		}
		return sum;
	}

}
