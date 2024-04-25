package com.digit;

public class CheckOddEvenUsingBitOpeerator {
	public static void main(String[] args) {
		int num =7;
		String checkEvenOdd = checkEvenOdd(num);
		System.out.println("Number is : " + checkEvenOdd);
	}
	
	public static String checkEvenOdd(int num) {
		 if((num&1) == 0)
		       return "even";
		       else
		        return "odd";
	}
}
