package com.ty;
public class Distinct {
	public static void main(String[] args) {
		int ar1 [] ={12, 13, 23, 15, 11, 16};
		int ar2 [] ={53, 26, 23, 15, 18, 13};
		
		for(int i=0;i<ar1.length;i++)
		{
			int p=0;
		  for(int j=0;j<ar2.length;j++)
		  {
			   if(ar1[i]==ar2[j])
			   {
				   p++;
				   break;
			   }
		  }
		  
		  if(p==0)
		  {
			  System.out.println(ar1[i]);
			 
		  }
		  
		  
		}
		for(int m=0;m<ar2.length;m++)
		{
			int l=0;
			for(int n=0;n<ar1.length;n++)
			{
				if(ar2[m]==ar1[n])
				{
					l++;
					break;
				}
			}
			if(l==0)
				System.out.println(ar2[m]);
				
		}
	}

}
