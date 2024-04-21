package com.second.lagest;

public class RotateMatrixby90DegreeButeForce {
 public static void main(String[] args) {
	
	 int n =4;
	 int [][]arr = new int[n][n];
	 int value= 0;
	 
	 for(int i =0 ;  i< n ; i++) {
		 for(int j =0 ; j< n ; j++) {
			 arr[i][j] = value;
			 value++;
		 }
	 }
	
	 print(arr ,n);
	 
	 rotatematrixBy90DegreeBruteForce(arr,n);
	 rotateMatrixBy90DegreeOptimalSolution(arr,n);
}
 
 public static void rotatematrixBy90DegreeBruteForce(int [][] arr ,int n) {
	 
	 int rotate [][] =new int[4][4];
	 for(int i = 0 ; i < n ; i++) {
		 for(int j = 0 ; j < n ; j++) {
			 rotate[j][(n-1) - i] = arr[i][j];
		 }
	 }
	 System.out.println("Reverse matrix ");
	 print(rotate ,n);
 }
 public static void rotateMatrixBy90DegreeOptimalSolution(int [][] arr ,int n) {
	 System.out.println("Optimal solution");
	 for(int i =0; i < n/2 ;i++) {
		 for(int j =i+1 ;  j < n-1 ; j++) {
			 int temp =arr[i][j];
			 arr[i][j] = arr[n - 1 -j][i];
			 arr[n -1 -j][i] = arr[n -1 -i][n - 1 -j];
			 arr[n - 1- i][n - 1 - j] = arr[j][n - 1- i];
			 arr[j][n - 1 - i] = temp;
			 //swapmatrix(arr[i][j],arr[j][i]);
			
		 }
	 }
	 print(arr ,n);
 }
 
 public static void print(int [][] arr ,int n) {
	 for(int i =0 ; i < n ;i++) {
		 for(int j = 0 ; j < n ; j++) {
			 System.out.print(arr[i][j] +" ");
		 }
		 System.out.println();
	 }
 }
}
