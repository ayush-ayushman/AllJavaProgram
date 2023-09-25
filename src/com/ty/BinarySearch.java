package com.ty;

public class BinarySearch {
	public static void main(String[] args) {
		int x[]= {50,40,30,20,10};
		int key=50;
		int y=ser(x,key);
		if(y<0)
			System.out.println("not found");
		else 
			System.out.println("found");
	}
	static int ser(int x[],int key)
	{
		int low=0;
		int high=(x.length)-1;
		int mid=0;
		while(low<=high)
		{
			mid=(low+high)/2;
			if(key==x[mid])
				return mid;
			else if(key>x[mid])
				  low=mid+1;
			else
				high=mid-1;
		}
		return -1;
	}

}
