package com.nagarro.ds;

public class Leetcode_ValidParan22 {
	private static void printValid(int n, int op, int cl, String ans) {
		if (op == n && cl == n) {
			System.out.println(ans);
			return;
		}
		if (op < n) {
			printValid(n, op + 1, cl, ans + '(');
		}
		if (op > cl) {
			printValid(n, op, cl + 1, ans + ')');
		}
	}

	public static void main(String args[]) {
		printValid(2, 0, 0, "");
	}

}
