package com.nagarro.ds;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FirstIndex {
	public static void firstIndex(int N, int[] arr, int M, int idx, List<Integer> ans) {
		if (idx == N) {
			return;
		}
		if (arr[idx] == M) {
			ans.add(idx);
		}
		firstIndex(N, arr, M, idx + 1, ans);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N;
		N = sc.nextInt();
		int[] arr;
		arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		int M;
		M = sc.nextInt();
		List<Integer> ans = new ArrayList<>();
		firstIndex(N, arr, M, 0, ans);
		for (int i = 0; i < ans.size(); i++) {
			System.out.print(ans.get(i) + " ");
		}
		sc.close();
	}

}
