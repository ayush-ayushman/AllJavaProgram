package com.ty;

public class CharWordCount {
	public static void main(String[] args) {
		String st="Rama And Laxamana";
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
		int x=t.length();
		System.out.print(t  +"  "  +x);
		
	}

}
