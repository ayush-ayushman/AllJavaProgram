package com.ty;

public class FactRange {
	public static void main(String[] args) {
		int i=1;
		while(i<=8)
		{
			int y=call(i);
			System.out.println(y);
			i++;
			
			
		}
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
