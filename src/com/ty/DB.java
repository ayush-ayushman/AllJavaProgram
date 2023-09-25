package com.ty;

public class DB {
	public static void main(String[] args) {
		int n =56;
		String st = "";
		while (n > 0) {
			int d = n % 8;

			st = d + st;
			n = n /8;
		}
		System.out.println(st);
	}
}
