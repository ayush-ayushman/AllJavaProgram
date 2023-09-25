package com.ty;

public class ContiguousSum {
	public static void main(String[] args) {
		int x[]={21,12,15,32,16,17,22};
		int y=x[0]+x[1];
		for(int i=0;i<x.length-1;i++)
		{
			if(x[i]+x[i+1]>y)
				 y=x[i]+x[i+1];
		}
		System.out.println(y);
	}

}
