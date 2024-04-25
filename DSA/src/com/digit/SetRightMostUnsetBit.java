package com.digit;

public class SetRightMostUnsetBit {
	public static void main(String[] args) {
		int num=10;
		
		System.out.println("Set right most unset bit :" + setUnsetBit(num));
	}
	
	public static int setUnsetBit(int num) {
		
		if((num & (num+1))==0)
			return num;
		
		return num|(num+1);
	}
}
