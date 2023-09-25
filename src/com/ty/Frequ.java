package com.ty;

public class Frequ {
	public static void main(String[] args) {
		int x[]={10,20,10,80,40,20,60,70,80};
		for(int i=0;i<x.length;i++)
		{
			int count=0;
			for(int j=0;j<x.length;j++)
			{
				if(x[i]==x[j]&&j<i)
					break;
				if(x[i]==x[j])
					count++;
			}
			if(count!=0)
				System.out.println(count);
		}
	}

}
