package com.ty;
public class Strong {
	public static void main(String[] args) {
		int n=145;
		int p=n;
		int sum=0;
		while(n>0)
		{
			int l=n%10;
			sum=sum+call(l);
			n=n/10;
		}
		System.out.println(sum);
	}
	
	static int call(int r)
	{
		int p=1;
		for(int i=1;i<=r;i++)
		{
			p=p*i;
		}
		return p;
	}

}
