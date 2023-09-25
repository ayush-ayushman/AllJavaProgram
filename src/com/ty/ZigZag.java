package com.ty;

public class ZigZag {
	public static void main(String[] args) {
		int ar1 [] = {12, 13, 23, 15, 11, 16};
		int ar2[]={53,26,23,15,18,13,23,45};
		int z[]=new int[ar1.length+ar2.length];
		int j=0;
		int k=0;
		for(int i=0;i<ar1.length+ar2.length;)
		{
		  if(j<ar1.length)
		  {
			z[i]=ar1[j];
			j++;
			i++;
		  }
		  if(k<ar2.length)
		  {
			  z[i]=ar2[k];
			  k++;
			  i++;
		  }
			
		}
		for(int m=0;m<z.length;m++)
		{
			System.out.print(z[m]);
		}
	}

}
