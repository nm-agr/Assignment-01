package com.nagarro.ds;

import java.util.Scanner;

public class MoneyChng {
	    public static long change(long amount, long[] coins) {
	        int n = coins.length;
	        if(amount == 0){
	            return 1;
	        }
	        if(n == 0){
	            return 0;
	        }
	        long[][] dp = new long[n+1][(int)amount+1];
	        for(long row = 0; row<=n;row++){
	            dp[(int)row][0] = 1;
	        }
	        for(long col = 1; col<=amount;col++){
	            dp[0][(int)col] = 0;
	        }
	        for(long r = 1 ; r <=n ;r++){
	            for(long c = 1; c<= amount; c++){
	                long inc = 0, exc = 0;
	                if(coins[(int)r-1] <= c){
	                    inc = dp[(int)r][(int)c - (int)coins[(int)r-1]];
	                }
	                exc = dp[(int)r-1][(int)c];
	                dp[(int)r][(int)c] = inc + exc;
	            }
	        }
	        return dp[n][(int)amount];
	    }
	    public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);
	        int T = sc.nextInt();
	        for(int i=0;i<T;i++){
	            long N = sc.nextLong();
	            long[] arr = new long[(int)N];
	            for(long j=0;j<N;j++){
	                arr[(int)j] = sc.nextInt();
	            }
	            Long amount = sc.nextLong();
	            System.out.println(change(amount,arr)% (1000000000 + 7));
	        }
	        sc.close();

	    }
	}
