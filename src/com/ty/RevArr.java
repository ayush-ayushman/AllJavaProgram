package com.ty;

public class RevArr {
	public static void main(String[] args) {
		int x[]={10,20,30,40,50};
		int y[]=new int[x.length];
		for(int i=0;i<x.length;i++)
		{
			y[i]=x[x.length-1-i];
		}
		for(int j=0;j<x.length;j++)
		{
			System.out.println(y[j]);
		}
	}

}
