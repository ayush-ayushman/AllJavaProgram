package com.ty;
public class Prime {
	public static void main(String[] args) {
		int i;
		int sum=0;
		for( i=1;i<=10;i++)
		{
			 int j;
			for(j=2;j<i;j++)
			{
				if(i%j==0)
					break;
			}
			if(i==j)
			{
				sum=sum+j;
				System.out.println(j);
			}
		}
		System.out.println(sum);
		
		
	}

}
