package com.digit;

public class IsPowerOfTwo {
	public static void main(String[] args) {
		int number =8;
		
		System.out.println("Number is power of 2 : " + isPowerOfTwo(number));
	}
	 public static boolean isPowerOfTwo(int n) {
	        
	        boolean ans = (n&(n-1))==0 ? true : false;
	        return ans;
	    }
}
