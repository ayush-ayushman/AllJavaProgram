package com.data.jsp;
public class countdate {
	public static void main(String[] args) {
		System.out.println("enter the first date");
		Data d1=Data.getData();
		System.out.println(d1);
		System.out.println("enter the second data");
		Data d2=Data.getData();
		System.out.println(d2);
		int days=d2.countdays()-d1.countdays();
		System.out.println("Days=" +days);
		int p=(days/365);
		int m=days%365/30;
		System.out.println("Month="+ +p+""+m);
		System.out.println("Year="+(days/365));
		
	}

}
