package com.ty;

public class Linear {
	public static void main(String[] args) {
		int x[]={12,20,60,78,4};
		int p=0;
		int i;
		for( i=0;i<x.length;i++)
		{
			if(x[i]==78)
			{
				p++;
				break;
			}
			
		}
		if(p==1)
			System.out.println("found" +(i+1));
		
	}

}
