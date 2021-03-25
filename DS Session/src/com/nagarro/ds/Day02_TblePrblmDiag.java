package com.nagarro.ds;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day02_TblePrblmDiag {
	public static void table(int cx, int cy, int dx, int dy, String ans,List<String> res) {
		if (cx > dx || cy > dy ) {
			return;
		}
		if (cx > dx && cy > dy) {
			return;
		}
		
		if (cx == dx && cy == dy) {
			res.add(ans);
			return;
		}
		table(cx, cy + 1, dx, dy, ans + "V", res);
		table(cx + 1, cy, dx, dy, ans + "H", res);
		if (cx == cy) {
		table(cx + 1, cy + 1, dx, dy, ans + "D", res);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<String> ans = new ArrayList<>();
        table(0, 0, N-1, N-1, "", ans);
		for (int i = 0 ; i < ans.size(); i++){
			System.out.print(ans.get(i)+" ");
		}
		System.out.println("");
		System.out.println(ans.size());
		sc.close();

	}

}
