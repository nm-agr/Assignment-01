package com.nagarro.ds;

public class multiplyString {
	public static String multiply(String num1, String num2) {
        int val1 = Integer.parseInt(num1);
        int val2 = Integer.parseInt(num2);
        String ans = String.valueOf(val1*val2);
        return ans;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(multiply("123456789","987654321"));
	}

}
