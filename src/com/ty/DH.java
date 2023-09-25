package com.ty;

public class DH {
	public static void main(String[] args) {
		int n=960;
		String s="";
		while(n>0)
		{
			int d=n%16;
			n=n/16;
			if(d>=0&&d<=9)
			     s=d+s;
			
			else if(d==10)
				     s="A"+s;
			else if(d== 11)
				   s="B"+s;
			else if(d==12)
				   s="C"+s;
			else if(d==13)
				  s="D"+s;
			else if(d==14)
				  s="E"+s;
			else if(d==15)
				  s="F"+s;
			
		}
		System.out.println(s);
		
	}

}
