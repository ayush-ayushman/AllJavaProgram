package com.ty;

public class StrToInt {
	public static void main(String[] args) {
		String st="3306";
		int sum=0;
		int p=1;
		char ch[]=st.toCharArray();
		for(int i=st.length()-1;i>=0;i--)
		{
			if(ch[i]>=48&&ch[i]<=57)
			{
				sum=sum+(ch[i]-48)*p;
				p=p*10;
			}
		}
		System.out.println(sum);
	}

}
