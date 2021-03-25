package com.nagarro.ds;

import java.util.Arrays;

public class distinctSub {
	public static int ans(String inp, String t, int n, int m, int[][] dp) {
		if (m == 0) {
			return 1;
		}
		if (n == 0 && m != 0) {
			return 0;
		}
		if (dp[n][m] != -1) {
			return dp[n][m];
		}
		int inc = 0, exc = 0;
		if (inp.charAt(n - 1) == t.charAt(m - 1)) {
			inc = ans(inp, t, n - 1, m - 1, dp);
		}
		exc = ans(inp, t, n - 1, m, dp);
		return dp[n][m] = inc + exc;
	}

	public static int iter(String inp, String t, int n, int m) {
		if (m == 0) {
			return 1;
		}
		if (n == 0 && m != 0) {
			return 0;
		}
		int[][] dp = new int[n + 1][m + 1];
		for (int i = 0; i <= n; i++) {
			dp[i][0] = 1;
		}
		for (int i = 1; i <= m; i++) {
			dp[0][i] = 0;
		}
		for (int r = 1; r <= n; r++) {
			for (int c = 1; c <= m; c++) {
				int inc = 0, exc = 0;
				if (inp.charAt(r - 1) == t.charAt(c - 1)) {
					inc = dp[r - 1][c - 1];
				}
				exc = dp[r - 1][c];
				dp[r][c] = inc + exc;
			}
		}
		return dp[n][m];

	}
	public static int recans(String inp, String t, int n, int m) {
	if(m == 0) {
		return 1;
	}
	if(n==0 && m!=0) {
		return 0;
	}
	int inc=0,exc=0;
	if (inp.charAt(n-1) == t.charAt(m-1)) {
		inc = recans(inp,t,n-1,m-1);
	}
	exc = recans(inp,t,n-1,m);
	return inc+exc;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] dp = new int[8][4];
		for (int[] row : dp) {
			Arrays.fill(row, -1);
		}
		//System.out.println(ans("babgbag", "bag", 7, 3, dp));
		System.out.println(iter("babgbag", "bag", 7, 3));
	}

}
