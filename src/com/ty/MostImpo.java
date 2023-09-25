package com.ty;
import java.util.Scanner;
public class MostImpo {
	public static void main(String[] args) {
		System.out.println("enter the first year");
		Scanner op=new Scanner(System.in);
		int dd=op.nextInt();
		int mm=op.nextInt();
		int yy=op.nextInt();
		System.out.println("first enter date are"+dd+"/"+mm+"/"+yy);
		int x=countdate(dd,mm,yy);
		System.out.println("enter the second year");
		int dd1=op.nextInt();
		int mm1=op.nextInt();
		int yy1=op.nextInt();
		System.out.println("second enter date are"+dd1+"/"+mm1+"/"+yy1);
		int y=countdate(dd1,mm1,yy1);
		int day=y-x;
		System.out.println("Day="+day);
		System.out.println("Month="+day/365+""+(day%365)/30);
		System.out.println("Year="+day/365);
		
		
	}

	private static int countdate(int dd, int mm, int yy)
	{
		int month[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
		if((yy%4==0&&yy%100!=0)||yy%400==0)
		{
			month[2]=29;
		}
		int y=yy-1;
		int days=y*365;
		days=days+(y/4-y/100+y/400);
		for(int i=1;i<mm;i++)
		{
			days=days+month[i];
		}
		
		return days;
	}

}
