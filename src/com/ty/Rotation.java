package com.ty;

import java.util.Scanner;

public class Rotation {
	public static void main(String[] args) {
		int x[][]=new int[2][2];
		Scanner op=new Scanner(System.in);
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				x[i][j]=op.nextInt();
			}
		
		}
		for(int i=1;i>=0;i--)
		{
			for(int j=1;j>=0;j--)
			{
				System.out.println(x[i][j]);
			}
		
		}
		for(int i=1;i>=0;i--)
		{
			for(int j=0;j<2;j++)
			{
				System.out.println(x[i][j]);
			}
		
		}
		for(int i=1;i>=0;i--)
		{
			for(int j=1;j>=0;j--)
			{
				System.out.println(x[i][j]);
			}
		
		}
		
	}

}
