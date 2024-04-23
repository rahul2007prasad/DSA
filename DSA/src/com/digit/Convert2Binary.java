package com.digit;

public class Convert2Binary {

	public static void main(String[] args) {
		
		int num =4;
		
		String convertToBinary = convertToBinary(num);
		StringBuilder sb = new StringBuilder();
		
		sb.append(convertToBinary);
		StringBuilder reverse = sb.reverse();
		
		System.out.println("Binary is " + reverse);
	}
	
	public static String convertToBinary(int num) {
		String res="";
		while(num != 1) {
			if(num % 2 ==1)
				res = res + '1';
			else
				res = res + '0';
			
			num= num /2;
		}
		return res;
	}
}
