package com.ty;

public class InvertedTri {
	public static void main(String[] args) {
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int k=i;k<5;k++)
			{
				System.out.print("*");
			}
            for(int k=1;k<5-i;k++)
            {
            	System.out.print("*");
            }
            System.out.println();
		}
		
	}

}
