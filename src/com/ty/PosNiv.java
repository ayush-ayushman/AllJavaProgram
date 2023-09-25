package com.ty;

public class PosNiv {
	public static void main(String[] args) {
		int x[]= {12,-2,8,-11};
		int pos=0;
		int neg=0;
		for(int i=0;i<x.length;i++)
		{
			if(x[i]<0)
				neg++;
			if(x[i]>0)
				pos++;
		}
		System.out.println(pos);
		System.out.println(neg);
	}

}
