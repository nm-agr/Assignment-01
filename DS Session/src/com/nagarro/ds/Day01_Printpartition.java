package com.nagarro.ds;

public class Day01_Printpartition {
	public static boolean isPallin(String str) {
		int i=0, j=str.length()-1;
		while (i<j) {
			if (str.charAt(i) == str.charAt(j)) {
				i++;
				j--;
			}
			else {
				return false;
			}
		}
		return true;
	}
	public static void ValidPallindParan(String inp,String out) {
		if (inp.length() == 0) {
			System.out.println(out);
		}
		for (int i=1; i<= inp.length(); i++) {
			if(isPallin(inp.substring(0,i)))
				ValidPallindParan(inp.substring(i),out+inp.substring(0,i)+"|");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ValidPallindParan("nitin","");
	}

}
