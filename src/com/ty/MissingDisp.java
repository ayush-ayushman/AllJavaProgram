package com.ty;
public class MissingDisp {
  public static void main(String[] args) {
	int x[]= {8,15,21,24,30,37};
	for(int i=0;i<x.length-1;i++)
	{
		int k=x[i];
		for(int j=k+1;j<x[i+1];j++)
		{
			
			System.out.print(j);
		}
	}
		
}
}
