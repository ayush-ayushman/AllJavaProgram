package com.ty;

import java.util.Scanner;

public class Spiral {
	public static void main(String[] args) {
		Scanner op=new Scanner(System.in);
		int x[][]=new int[4][4];
		int m=4;
		int n=4;
		int i;
		for( i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				x[i][j]=op.nextInt();
			}
		}
		int k=0;
		int l=0;
		int lastrow=m-1;
		int lastcolumn=n-1;
		while(k<=lastrow&&l<=lastcolumn)
		{
			for( i=l;i<=lastcolumn;i++)
			{
				System.out.print(x[k][i]);
				
			}
			k++;
			for( i=k;i<=lastrow;i++)
			{
				System.out.print(x[i][lastcolumn]);
			}
			lastcolumn--;
			if(k<=lastrow)
			{
				for(i=lastcolumn;i>=l;i--)
				{
					System.out.print(x[lastrow][i]);
				}
				lastrow--;
			}
			if(l<=lastcolumn)
			{
				for(i=lastrow;i>=k;i--)
				{
					System.out.print(x[i][l]);
				}
				l++;
			}
			
			
		}
	}

}
