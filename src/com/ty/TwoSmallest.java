package com.ty;
public class TwoSmallest {
	public static void main(String[] args) {
		int x[]= {111,100,7,10,50,0};
		int fy=x[0];
		int sy=x[1];
		for(int i=1;i<x.length;i++)
		{
			if(x[i]<fy)
			{
			    
				 fy=x[i];
				
			}
		}
		System.out.println(fy);
		
		for(int i=1;i<x.length;i++)
		{
			if(x[i]<sy&&x[i]>fy)
			{
			   sy=x[i];
				
			}
		}
		System.out.println(sy);
	    
       
		
		
	}

}
