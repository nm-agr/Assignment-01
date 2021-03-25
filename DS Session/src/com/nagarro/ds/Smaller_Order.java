package com.nagarro.ds;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Smaller_Order {
		public static void orderSmall(String inp, String out, int l, List<String> resList){
			if(out.length() == l){
				resList.add(out);
				return;
			}
			for(int i = 0; i < inp.length(); i++){
				if (i == inp.length()-1)
					orderSmall(inp.substring(0,i),out+inp.substring(i),l,resList);
				else {
					orderSmall(inp.substring(0,i)+inp.substring(i+1),out+inp.charAt(i),l,resList);
					//System.out.println(i+inp + "---" +out);
				}
			}
		}
	    public static void main(String args[]) {
	        // Your Code Here
			Scanner sc = new Scanner(System.in);
			String inp = sc.next();
			int l = inp.length();
			List<String> resList = new ArrayList<>();
			orderSmall(inp,"",l,resList);
			Collections.sort(resList);
			for(int i = 0; i < resList.size(); i++){
				if (resList.get(i).equals(inp))
					break;
				else
					System.out.println(resList.get(i));
			}
			sc.close();
	    }
	}
