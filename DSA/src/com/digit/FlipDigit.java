package com.digit;

public class FlipDigit {
	public static void main(String[] args) {

		int num11 = 7;
		int num2 = 12;
		flipBits(num11, num2);
	}

	public static void flipBits(int A, int B) {
		// Write your code here.
		int res = A ^ B;

		int calculateIndex = calculateIndex(res);
		System.out.println("total indexes to fliped :" + calculateIndex);
	}

	public static int calculateIndex(int digit) {

		int count = 0;

		int res = 0;

		while (digit >= (1 << count)) {

			if ((digit & (1 << count)) != 0) {

				res++;

			}

			count++;

		}

		return res;
	}
}
