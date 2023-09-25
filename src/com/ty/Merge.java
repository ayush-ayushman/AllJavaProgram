package com.ty;
public class Merge {
	public static void main(String[] args) {
		int x[]={10,20,30,40,50};
		int y[]={60,70,80,90,100,110,120};
		int p=(x.length)+(y.length);
		int l[]=new int[p];
		for(int i=0;i<x.length;i++)
		{
			l[i]=x[i];
		}
		for(int k=0;k<y.length;k++)
		{
			l[x.length+k]=y[k];
		}
		for(int h=0;h<l.length;h++)
		{
			System.out.println(l[h]);
		}
		
	}
	
	

}
