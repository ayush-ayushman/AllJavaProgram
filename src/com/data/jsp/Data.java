package com.data.jsp;

import java.util.Scanner;

public class Data {
	int month[]={0,31,28,31,30,31,30,31,31,30,31,30,30};
	public int dd;
	public int mm;
	public int yy;
	public Data(int dd, int mm, int yy) {
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
		if((yy%4==0&&yy%100!=0)||(yy%400==0))
			   month[2]=29;
	}
	
	@Override
	public String toString() {
		return "Data [dd=" + dd + ", mm=" + mm + ", yy=" + yy + "]";
	}
	public static Data getData() {
		Scanner op=new Scanner(System.in);
		int d=op.nextInt();
		int m=op.nextInt();
		int y=op.nextInt();
		Data d1=new Data(d,m,y);
		return d1;
	}

	int countdays()
	{
		
		int y=yy-1;
		int x=y*365;
		int l=x+(y/4-y/100+y/400);
		for(int i=1;i<mm;i++)
		{
			l=l+month[i];
		}
		l=l+dd;
		return l;
		
	}
	
	

}
