package com.digit;

public class OneOddOccuring {
	public static void main(String[] args) {
		int [] arr = {4 ,5 ,6 ,5 ,6 ,9 ,9 ,4 ,4};
		int n =9;
		
		missingNumber(n, arr);
		
	}
	

    public static int missingNumber(int n, int []arr){
        // Write your code here.
        int res=0;
        for(int i=0 ; i < n ;  i++){
                res = res^arr[i];
        }
        System.out.println("result " + res);
        return res;
    }
}
