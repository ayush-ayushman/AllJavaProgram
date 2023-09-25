package com.ty;

public class NoOfElementWoArray {
	public static void main(String[] args) {
		int x[]= {10,20,30,10,20,50};
		call(x);
	}

	private static void call(int[] y)
	{
		int p=y[0];
		for(int i=1;i<y.length;i++)
		{
			if(y[i]>p)
				 p=y[i];
		}
		int l[]=new int[p+1];
		for(int i=0;i<y.length;i++)
		{
			l[y[i]]=l[y[i]]+1;
		}
		for(int k=0;k<l.length;k++)
		{
			if(l[k]>0)
				System.out.println(k+" "+l[k]);
		}
		
	}

}
