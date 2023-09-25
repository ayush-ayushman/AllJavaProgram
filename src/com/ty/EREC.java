package com.ty;

import java.util.Scanner;

public class EREC {
	public static void main(String[] args) {
		int x[][]=new int[3][3];
		Scanner op=new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				x[i][j]=op.nextInt();
				
			}
		}
		for(int i=0;i<3;i++)
		{
			int p=x[0][i];
			for(int j=0;j<3;j++)
			{
				if(x[i][j]>p)
					p=x[i][j];
				
			}
			System.out.println(p);
		}
		int j=0;
		for(int i=0;i<3;i++)
		{
			int p= x[0][i];
			for(j=0;j<3;j++)
			{
				if(x[j][i]>p)
					p=x[j][i];
				
			}
			System.out.println(p);
		}
		
		
	}

}
