package com.ty;

public class SecondBiggest {
	public static void main(String[] args) {
		int s[]= {10,96,2,9,740};
		int pos=s[0];
		int som=s[0];
		for(int i=1;i<s.length;i++)
		{
			if(s[i]>pos)
				 pos=s[i];
			
		}
		for(int i1=1;i1<s.length;i1++)
		{
			if(s[i1]<som)
				 som=s[i1];
			
		}
		System.out.println(pos);
		System.out.println(som);
		

	}
	

}
