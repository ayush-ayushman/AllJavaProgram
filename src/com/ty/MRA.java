package com.ty;

public class MRA {
	public static void main(String[] args) {
		int n=5;
		for(int i=0;i<5;i++)
		{
			for(int j=1;j<n-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
