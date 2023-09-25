package com.ty;

public class BiggestArray {
	public static void main(String[] args) {
		int s[]= {1,8,99,66,75};
		int pb=s[0];
		int sb=s[1];
		for(int i=1;i<s.length;i++)
		{
			if(s[i]>pb)
			{
				 pb=s[i];
				
			}
			if(s[i]>sb&&s[i]<pb)
				sb=s[i];
			
		}
		System.out.println(pb);
		System.out.println(sb);
		
		
		
	}

}
