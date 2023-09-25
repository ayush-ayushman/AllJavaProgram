package com.ty;

public class UtLandLtU {
	public static void main(String[] args) {
		String st="aYusH ayushMan newHelhi pAtna";
		String t="";
		char ch[]=st.toCharArray();
		int i;
		for(i=0;i<ch.length;i++)
		{
			if(ch[i]>=65&&ch[i]<=90)
			{
				t=t+(char)(ch[i]+32);
			}
			else if(ch[i]>=97&&ch[i]<=122)
				t=t+(char)(ch[i]-32);
			else
				t=t+ch[i];
		}
		System.out.println(t);
	}
	}


