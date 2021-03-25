package com.nagarro.ds;

import java.util.Arrays;
import java.util.Stack;

public class stkProgram {
	public static void prog2(int[] arr, int n) {
		int[] ans = new int[n];
		Stack<Integer> st = new Stack<>();
		st.push(0);
		for(int i =1 ; i< n ;i++) {
			while(!st.empty() && arr[st.peek()] < arr[i]) {
				ans[st.pop()] = arr[i];
			}
			st.push(i);
		}
		while(!st.empty()) {
			ans[st.pop()]=-1;
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(ans));
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {11,13,21,3};
		prog2(arr,4);
		//1,1,1,2,1,4,7

	}

}
