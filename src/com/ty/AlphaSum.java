package com.ty;

public class AlphaSum {
	public static void main(String[] args) {
		String st="139y1d5801";
		int sum=0;
		char ch[]=st.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>=48&&ch[i]<=57)
				sum=sum+(ch[i]-48);
		}
		System.out.println(sum);
	}

}
