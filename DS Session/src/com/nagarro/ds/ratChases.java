
package com.nagarro.ds;

import java.util.*;

public class ratChases {
	public static void table2(List<String> checkArray,String[][] maze, int cx, int cy, int dx, int dy, String ans, boolean[][] vis,
			int[][] res) {
		if (cx > dx || cy > dy || vis[cx][cy] == true || maze[cx][cy].equals("X")) {
			return;
		}
		if (cx == dx && cy == dy) {
			checkArray.add(ans);
			if (checkArray.size() < 2) {
			int j = 0, k = 0;
			for (int i = 0; i < ans.length(); i++) {
				if (ans.substring(i, i + 1).equals("D")) {
					j += 1;
					res[j][k] = 1;
				} else {
					k += 1;
					res[j][k] = 1;
				}
			}
			}
			return;
		}
		vis[cx][cy] = true;
		table2(checkArray, maze, cx, cy + 1, dx, dy, ans + "R", vis, res);
		table2(checkArray, maze, cx + 1, cy, dx, dy, ans + "D", vis, res);
		vis[cx][cy] = false;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		String[][] maze = new String[r][c];
		String[] single = new String[r];
		for (int i = 0; i < r; i++) {
			single[i] = sc.next();
		}
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				maze[i][j] = single[i].substring(j, j + 1);
			}
		}
		int[][] arr;
		arr = new int[r][c];
		arr[0][0] = 1;
		List<String> checkArray = new ArrayList<>();
		table2(checkArray,maze, 0, 0, r - 1, c - 1, "", new boolean[r][c], arr);

		if (arr[r - 1][c - 1] == 0) {
			System.out.println("NO PATH FOUND");
		} else {
			for (int i = 0; i < r; i++) {
				for (int j = 0; j < c; j++) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println("");
			}
		}
		sc.close();
	}
}