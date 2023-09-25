package com.ty;
public class Fab {
 public static void main(String[] args) {
	 int a=0;
	 int b=1;
	 int sum=1;
	 System.out.print(a);
	 System.out.print(b);
		for(int k=2;k<=10;k++)
		{
			int c=a+b;
			a=b;
			b=c;
			System.out.print(c);
			sum=sum+c;
		}
		System.out.println("SUM" +sum);
}
	

}
