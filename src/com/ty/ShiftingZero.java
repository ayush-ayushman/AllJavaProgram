package com.ty;

public class ShiftingZero {
	public static void main(String[] args) {
		int a[]={40,6,0,80,2,0,8,9,0,2};
		for(int i=1;i<a.length;i++)
		{
			for(int j=0;j<a.length-i;j++)
			{
				if(a[j]==0)
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
