package com.ty;

public class ExchangeArray {
	public static void main(String[] args) {
		int x[]= {21,12,15,32,16,17,22};
		int y=x.length/2;
		for(int i=0;i<x.length/2;i++)
		{
			int temp;
			temp=x[i];
			x[i]=x[x.length-1-i];
			x[x.length-1-i]=temp;
		}
		int p=(x.length/2)/2;
		for(int h=0;h<p;h++)
		{
			int temp;
			temp=x[h];
			x[h]=x[y-h-1];
			x[y-h-1]=temp;
			
		}
		for(int h=0;h<p;h++)
		{
			int temp;
			temp=x[y+1+h];
			x[y+1+h]=x[x.length-1-h];
			x[x.length-1-h]=temp;
			
		}
		for(int i=0;i<x.length;i++)
		{
			System.out.print(x[i]);
		}
	}

}
