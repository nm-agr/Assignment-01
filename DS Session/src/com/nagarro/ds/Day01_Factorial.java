package com.nagarro.ds;

public class Day01_Factorial {
	public static int fact(int n) { // Stack Pop Function
		if (n == 0) {
			return 1;
		}
		int ansFact=fact(n-1);
		return n*ansFact;
	}
	
	public static void fact(int n,int ans) { //Stack Build Function
		if (n == 0) {
			System.out.println(ans);
			return;
		}
		fact(n-1,ans*n);
	}
	public static void main(String args[]) {
		System.out.println(fact(5));
		fact(4,1);
	}

}
