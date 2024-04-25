package com.digit;

public class CountTotalSetBits {
	public static void main(String[] args) {
		
		int num =5;
		int countTotalBitSets = countTotalBitSets(num);
		System.out.println("Total count set bit from  to n in number : " + countTotalBitSets);
		
	}
	
	public static int countTotalBitSets(int num) {
		
		int total=0;
		for(int i=0; i <= num ; i++) {
			total = total + countSet(num);
		}
		
		return total;
	}
	
	public static int countSet(int n) {
		int count =0;
		
		while(n >0) {
			if((n&1) != 0)
				count++;
			n = n>>1;
		}
		return count;
	}
}
