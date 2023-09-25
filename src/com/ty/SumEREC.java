package com.ty;

import java.util.Scanner;

public class SumEREC {
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
			int p=0;
			for(int j=0;j<3;j++)
			{
				
					p=p+x[i][j];
				
			}
			System.out.println(p);
			p=0;
		}
		int j=0;
		for(int i=0;i<3;i++)
		{
			int p=0;
			for(j=0;j<3;j++)
			{
				
					p=p+x[j][i];
				
			}
			System.out.println(p);
			p=0;
		}
		
		
	}


}
