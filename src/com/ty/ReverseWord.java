package com.ty;

public class ReverseWord {
	public static void main(String[] args) {
		String st="rama and laxamana";
		char ch[]=st.toCharArray();
		String t="";
		int i=0;
		while(i<ch.length)
		{
			if(ch[i]!=' ')
			{
				t=t+ch[i];
			}
			else
			{
				call(t);
				t="";
			}
			i++;
		}
		call(t);
	}

	private static void call(String t)
	{
		char ch[]=t.toCharArray();
		String t1="";
		for(int i=ch.length-1;i>=0;i--)
		{
			t1=t1+ch[i];
		}
		System.out.print(t1+" ");
		
	}
	}


