package com.ty;

import java.util.Scanner;

public class MatMul {
	public static void main(String[] args) {
		int x[][]=new int[2][2];
		int y[][]=new int[2][2];
		int z[][]=new int [2][2];
		Scanner op=new Scanner(System.in);
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				x[i][j]=op.nextInt();
			}
		
		}
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				y[i][j]=op.nextInt();
			}
		
		}
		for(int i=0;i<2;i++)
		{
			
			for(int j=0;j<2;j++)
			{
			  int sum=0;
			  for(int k=0;k<2;k++)
			  {
				 sum=sum+x[i][k] *y[k][j];
				 
			  }
			  z[i][j]=sum;
				
			}
		
		}
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.println(z[i][j]);
			}
		
		}
	}

}
