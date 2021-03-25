package com.nagarro.ds;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ExchngCoin {
	public static long coin(long num) {
		Map<Long, Long> hm = new HashMap<Long , Long>();
	    hm.put((long)0, (long)0);
	    hm.put((long)1, (long)1);
	    hm.put((long)2, (long)2);
	    hm.put((long)3, (long)3);
	    for(long i=4; i<=num; i++){
	        long q1,q2;
	        q1 = i;
	        q2 = hm.get(i/2) + hm.get(i/3) + hm.get(i/4);
	        hm.put(i, Math.max(q1, q2));
	    }
	    return hm.get(num);
	}
	public static long gold(long n, Map<Long,Long> dp){
		if (n==0){
			return 0;

		}
		if(dp.get(n) !=0){
			return dp.get(n);
		}
		dp.put(n,Math.max(dp.get(n), Math.max(n, gold(n/2,dp)+gold(n/3,dp)+gold(n/4,dp))));
		//dp[n]=max(dp[n],max(n,gold(n/2)+gold(n/3)+gold(n/4)));
		return dp.get(n);

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long num = sc.nextLong();
		Map<Long, Long> hm = new HashMap<Long , Long>();
	    hm.put((long)0, (long)0);
	    hm.put((long)1, (long)1);
	    hm.put((long)2, (long)2);
	    hm.put((long)3, (long)3);
	    //hm.put(num, (long)-1);
		System.out.println(gold(num,hm));
		sc.close();

	}

}
