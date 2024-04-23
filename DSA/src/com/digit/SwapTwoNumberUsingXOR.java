package com.digit;

public class SwapTwoNumberUsingXOR {
	public static void main(String[] args) {

		int a = 3;
		int b = 4;
		System.out.println("before swap  a: " + a + " b : " + b);
		swapXOR(a, b);
		swapThirdVariable(a, b);
	}

	public static void swapXOR(int num1, int num2) {
		int a = num1;
		int b = num2;
		a = a ^ b;
		b = a ^ b;
		a = (a ^ b);

		System.out.println("after swap  a: " + a + " b : " + b);
	}
	
	public static void swapThirdVariable(int num1 ,int num2) {
		int temp = num1;
		num1 = num2;
		num2= temp;
		System.out.println("After swap using thrid variable a: "+ num1 + " b : " +num2);
	}
}
