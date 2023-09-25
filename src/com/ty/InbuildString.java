package com.ty;
public class InbuildString {
	public static void main(String[] args) {
		String st1="AyushNewAyushman";
		String st2="Ayushman";
		char ch1[]=st1.toCharArray();
		char ch2[]=st2.toCharArray();
		int p=0;
		for(int i=0;i<ch1.length;i++)
		{
			int k=i;
			int j=0;
	        while(j<ch2.length &&k<ch1.length&&ch1[k]==ch2[j])
			{
					k++;
					j++;
			}
			
			if(j==ch2.length)
			{
				System.out.println("found");
				p++;
		
			}
			
			
		}
		if(p==0)
			System.out.println("not found");
	}

}
