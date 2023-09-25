package com.ty;

public class BD {
	public static void main(String[] args) {
		int x=763;
		int sum=0;
		int p=1;
		while(x>0)
		{
			int d=x%10;
			x=x/10;
			sum=(p*d)+sum;
			p=p*8;
			
		}
		System.out.println(sum);
		
	}

}
