package com.nagarro.ds;

public class Day02_TablePrblm {
	public static void table(int[][] maze,int cx, int cy, int dx, int dy,String ans) {
		if (cx > dx || cy > dy  || maze[cx][cy] == 1) {
			return;
		}
		if (cx == dx && cy == dy ) {
			System.out.println(ans);
			return;
		}
		
		table(maze, cx, cy + 1, dx, dy, ans + "R");
		table(maze, cx + 1, cy, dx, dy, ans + "L");
		
		
	}
	public static void table2(int[][] maze, int cx, int cy, int dx, int dy,String ans, boolean[][] vis) {
		if ( cx < 0 || cy < 0 ||cx > dx || cy > dy || vis[cx][cy] == true || maze[cx][cy] == 1) {
			return;
		}
		if (cx == dx && cy == dy ) {
			System.out.println(ans);
			return;
		}
		vis[cx][cy] = true;
		table2(maze, cx - 1, cy, dx, dy, ans + "T", vis);
		table2(maze, cx + 1, cy, dx, dy, ans + "D", vis);
		table2(maze, cx, cy - 1, dx, dy, ans + "L", vis);
		table2(maze, cx, cy + 1, dx, dy, ans + "R", vis);
		vis[cx][cy] = false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] maze = {{0,1,0,0}, {0, 0, 0, 1},{1, 0, 1, 0},{1, 0, 0, 1},{1,1,0,0}};
		//table(maze, 0, 0, 4, 4, "");
		table2(maze,0,0,4,3,"",new boolean[5][4]);

	}

}
