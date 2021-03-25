package com.nagarro.ds;

public class MoveAllxAtEnd {
	public static void move(String inp, String out, String xx, int idx, int N) {
		if (idx == N) {
			System.out.println(out + xx);
			return;
		}
		if (inp.substring(idx, idx + 1).equals("x")) {
			move(inp, out, xx + 'x', idx + 1, N);
		} else {
			move(inp, out + inp.substring(idx, idx + 1), xx, idx + 1, N);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inp = "abexexdexed";
		move(inp, "", "", 0, inp.length());

	}

}
