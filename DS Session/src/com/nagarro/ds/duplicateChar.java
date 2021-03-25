
package com.nagarro.ds;

public class duplicateChar {
	public static void charFormat(String inp, String out, int idx) {
		if(idx == inp.length()-1) {
			System.out.println(out);
			return;
		}
		
		if(inp.substring(idx, idx+1).equals(inp.substring(idx+1, idx+2))) {
			charFormat(inp,out+inp.substring(idx,idx+1)+"*",idx+1);
		}
		else {
			charFormat(inp,out+inp.substring(idx, idx+1),idx+1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inp = "hello#";
		charFormat(inp, "", 0);

	}

}
