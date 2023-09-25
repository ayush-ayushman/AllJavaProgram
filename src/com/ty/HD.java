package com.ty;
public class HD {
	public static void main(String[] args) {
		String st="1D5";
		int sum=0;
		int p=1;
		char ch[]=st.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			if(ch[i]>=48&&ch[i]<=57)
			{
				sum=sum+(ch[i]-48)*p;
			    p=p*16;
			}
			else if(ch[i]>=65&&ch[i]<=70)
			{
				sum=sum+(ch[i]-55)*p;
				p=p*16;
			}
						
		}
		System.out.println(sum);
	}

}
