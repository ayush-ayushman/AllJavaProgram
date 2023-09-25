package com.ty;
import java.util.HashSet;
import java.util.Set;

public class MostImportant {
	public static void main(String[] args) {
		int ar1[]= {1,2,3,4};
		int ar2[]= {3,4,5,6,5};
		call(ar1,ar2);
		caller(ar2,ar1);
	}

	private static void caller(int[] ar2, int[] ar1)
    {
		Set<Integer> op=new HashSet<Integer>();
		int i1=0;
		
		for(int i=0;i<ar2.length;i++)
		  {
			  int p=0;
			  for(int j=0;j<ar1.length;j++)
			  {
				  if(ar2[i]==ar1[j])
				  {
					  p++;
					  break;
				  }
				  
			  }
			  if(p==0)
			  {
				 op.add( ar2[i]);
				  
				  
			  }
				   
		  }
		  for (Integer in : op) {
			  System.out.println(in);
			
		}
		 
		
		
	}

	private static void call(int[] ar1, int[] ar2)
	{
		Set<Integer> op=new HashSet<Integer>();
	  
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
			  op.add(ar1[i]);
			 
		  }
			 
	  }
	  for (Integer in : op) {
		System.out.println(in);
	}
	 
	}

}
