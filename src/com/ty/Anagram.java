package com.ty;

public class Anagram {
	public static void main(String[] args) {
		String s1="Mother in law";
		String s2="Hitler woman";
		String s3=remov(s1);
		String s4=remov(s2);
		String l1=change(s3);
		String l2=change(s4);
		String m=sor(l1);
		String n=sor(l2);
		System.out.println(m);
		System.out.println(n);
		System.out.println(m.equals(n));
	}
	private static String sor(String s1) {
		
		char ch1[]=s1.toCharArray();
		for(int i=1;i<ch1.length;i++)
		{
			for(int j=0;j<ch1.length-i;j++)
			{
				if(ch1[j]>ch1[j+1])
				{
					char temp;
					temp=ch1[j];
					ch1[j]=ch1[j+1];
					ch1[j+1]=temp;
					
				}
				
				
			}
		}
		String p=new String(ch1);
		return p;
	}
	private static String change(String s1) 
	{
		String s3="";
		char ch1[]=s1.toCharArray();
		for(int i=0;i<ch1.length;i++)
		{
			if(ch1[i]>=65&&ch1[i]<=90)
				s3=s3+ch1[i];
			else if(ch1[i]>=97&&ch1[i]<=122)
				s3=s3+(char)(ch1[i]-32);
		}
		return s3;
	}
	public static String remov(String s1)
	{
		String s3="";
		char ch1[]=s1.toCharArray();
		for(int i=0;i<ch1.length;i++)
		{
			if(ch1[i]>=65&&ch1[i]<=90)
				s3=s3+ch1[i];
			else if(ch1[i]>=97&&ch1[i]<=122)
				s3=s3+ch1[i];
		}
		return s3;
	}

}
