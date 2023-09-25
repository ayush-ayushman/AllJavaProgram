package com.ty;

public class NoChar {
	public static void main(String[] args) {
		String s1="adkvdh dodksk";
		int s=0;
		char ch1[]=s1.toCharArray();
		for(int i=0;i<ch1.length;i++)
		{
			if(ch1[i]>=65&&ch1[i]<=90)
				s++;
			else if(ch1[i]>=97&&ch1[i]<=122)
				s++;
			else
				continue;
		}
		System.out.println(s);
	}

}
