package com.nagarro.ds;
import java.util.Scanner;

public class Leetcode_Subset22 {
	public static void subset(String arr, String subset, int vidx) {
		if (vidx == arr.length()) {
			System.out.print(subset+" ");
			return;
		}
		subset(arr, subset, vidx + 1);
		subset(arr, subset + arr.substring(vidx, vidx + 1), vidx + 1);
		//subset(arr, subset + Integer.toString((int)arr.charAt(vidx)),vidx+1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String arr = sc.next();
		subset(arr, "", 0);
		System.out.println("");
		System.out.println((int)Math.pow(3, arr.length()));
		sc.close();
	}
}
