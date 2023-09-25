package com.ty;

public class Imp1 {
	public static void main(String[] args) {
		int n=3;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			int k1=1;
			for(int k=0;k<i;k++)
			{
				System.out.print(k1);
				k1++;
			}
			
			for(int k=1;k<i;k++)
			{
				k1=k1-2;
				System.out.print(k1);
				k1++;
			}
			
			System.out.println();
		}
		for(int l=1;l<n;l++)
		{
			for(int k=1;k<=l;k++)
			{
				System.out.print(" ");
			}
			int k=1;
			for(int h=1;h<=n-l;h++)
			{
				System.out.print(k);
				k++;
			}
			for(int f=1;f<n-l;f++)
			{
				k=k-2;
				System.out.print(k);
			}
			System.out.println();
		}
	}

}
