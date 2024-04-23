package com.digit;

public class CheckIthBitSet {
	public static void main(String[] args) {

		boolean checkIthBitSet = checkIthBitSet(5,1);
		System.out.println("Is Ith bit set :" + checkIthBitSet);
		
		boolean optimalSol = optimal(3, 2);
		System.out.println("Is Ith bit set :" + optimalSol);
	}

	public static boolean checkIthBitSet(int number ,int k) {
		char checkIndex=(char)k;
		String convertDecimalToBnary = convertDecimalToBnary(number);
		System.out.println("Binary agains decimal : " + convertDecimalToBnary +" leng " + convertDecimalToBnary.length());
		
		Integer binaryNum = Integer.valueOf(convertDecimalToBnary);
		
		for(int i = convertDecimalToBnary.length()-1 ; i>0 ; i--) {
			if(convertDecimalToBnary.charAt(checkIndex-1)== '1')
				return true;
			else
				return false;
		}
		
		return false;
	}

	public static String convertDecimalToBnary(int number) {
		String res = "";
		while (number > 0) {

			res = (number % 2) + res;

			number = number / 2;
		}
		return res;
	}
	
	public static boolean optimal(int n , int k) {
		int p=(1<<(k-1));

        if((n & p) !=0){

            return true;

        }

        else{

            return false;
	}
	}
}
