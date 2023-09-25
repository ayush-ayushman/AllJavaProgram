package com.ty;

public class Storting {
	public static void main(String[] args) {
		int a[]={40,6,15,80,2};
		for(int i=1;i<a.length;i++)
		{
			for(int j=0;j<a.length-i;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp;
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
				
			}
		}
		for (int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
