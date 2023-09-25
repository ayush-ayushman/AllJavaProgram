package com.ty;

public class InserArr {
	public static void main(String[] args) {
		int x[]= {10,20,30,40,50};
		int y[]=new int[x.length+1];
		int key=100;
		int ind=2;
		for(int i=0;i<ind;i++)
		{
			y[i]=x[i];
		}
		y[ind]=key;
		for(int j=ind+1;j<y.length;j++)
		{
			y[j]=x[j-1];
		}
		for(int k=0;k<y.length;k++)
		{
			System.out.println(y[k]);
		}
		
	}

}
