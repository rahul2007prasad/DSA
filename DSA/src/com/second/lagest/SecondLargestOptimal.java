package com.second.lagest;

public class SecondLargestOptimal {
	public static void main(String[] args) {

		// Time complexicity : O(N)

		int arr[] = { 2, 1, 4, 5, 3, 6, 4 };

		System.out.println("Second Largest :" + secondlargestoptimal(arr));
		System.out.println("Second smallest  :" + secondSmallestOptimal(arr));

	}

	public static int secondlargestoptimal(int arr[]) {

		int largest = arr[0];
		int secondLargest = Integer.MIN_VALUE;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
			} else if (arr[i] < largest && arr[i] > secondLargest)
				secondLargest = arr[i];
		}

		return secondLargest;
	}

	public static int secondSmallestOptimal(int arr[]) {
		int smallest = arr[0];
		int secondSmallest = Integer.MIN_VALUE;

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < smallest) {
				secondSmallest = smallest;
				smallest = arr[i];
			} else if (arr[i] < smallest && arr[i] > secondSmallest)
				secondSmallest = arr[i];
		}
		return secondSmallest;

	}
}
