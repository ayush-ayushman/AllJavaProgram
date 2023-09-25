package com.ty;

public class DtAll {
	public static void main(String[] args) {
		String st="0123456789ABCDEF";
		String k="";
		int n=469;
		int base=16;
		while(n>0)
		{
			int p=n%base;
			n=n/base;
			k=st.charAt(p)+k;
		}
		System.out.println(k);
	}

}
