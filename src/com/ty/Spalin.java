package com.ty;
public class Spalin {
public static void main(String[] args) {
	String s1="Malayalam";
	String s3="";
	char ch1[]=s1.toCharArray();
	for(int i=ch1.length-1;i>=0;i--)
	{
		s3=s3+ch1[i];
	}
	boolean st=s3.equalsIgnoreCase(s1);
	System.out.println(st);
}
}
