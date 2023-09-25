package com.ty;

public class PerfectRange {
	public static void main(String[] args) {
		int i;
		for( i=1;i<100;i++)
		{
		 
		   int h=call(i);
		   if(h==i)
		      System.out.println(h);
		}
		
		
	}
   static int call(int y)
   {
	  int l=0; 
	  for(int i=1;i<y;i++)
	  {
		  if(y%i==0)
			  l=l+i;
	  }
	   
	   return l;
    }
		

	

}
