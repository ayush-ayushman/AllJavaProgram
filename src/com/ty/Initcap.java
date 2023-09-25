package com.ty;

public class Initcap {
	public static void main(String[] args) {
		String st="ayush ayushman newdelhi patna";
		String t="";
		char ch[]=st.toCharArray();
		int i;
		for(i=0;i<ch.length;i++)
		{
			if(i==0||(ch[i-1]==' ' && ch[i]!=' '))
			{
				t=t+(char)(ch[i]-32);
			}
			else
				t=t+ch[i];
		}
		System.out.println(t);
	}

}
