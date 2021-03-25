package com.nagarro.ds;

public class Day01_Dec {
	public static void Inc(int n) {
		if (n == 0) {
			return;
		}
		
		System.out.println(n);
		Inc(n-1);
	}
	public static void dec(int n) {
		if (n == 0) {
			return;
		}
		
		System.out.println(n);
		dec(n-1);
		System.out.println(n);
	}
	public static void main(String args[]) {
		dec(5);
		//Inc(5);
	}
}
