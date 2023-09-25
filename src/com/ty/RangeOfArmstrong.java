package com.ty;
public class RangeOfArmstrong {
	public static void main(String[] args) {
		int i;
		for( i=0;i<=300;i++)
		{
			int cdig=call(i);
			int s=caller(i,cdig);
			if(i==s)
				System.out.println(i);
		
		}
	}

	private static int caller(int i, int z) 
	{
		int sum=0;
		for(int p=0;p<z;p++)
		{
			int d=i%10;
			sum=sum+fac(d,z);
			i=i/10;
		}
		
		return sum;
		
	}

	private static int fac(int d, int z)
	{
		int p=1;
		for(int i=0;i<z;i++)
		{
			p=d*p;
		}
		
		return p;
	}

	private static int call(int i)
	{
		int p=0;
		while(i>0)
		{
			int d=i%10;
			p++;
			i=i/10;
			
			
		}
		return p;
		
		
	}

}
