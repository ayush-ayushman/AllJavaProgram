package com.ty;

public class Perfect {
	public static void main(String[] args) {
		int x=6;
		int sum=0;
		for(int i=1;i<x;i++)
		{
			if(x%i==0)
				sum=sum+i;
		}
		System.out.println(sum);

	}
}
