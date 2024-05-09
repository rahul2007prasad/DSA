package com.graph;

public class NoOfUndirectedGraph {

	public static void main(String[] args) {
		int numOfVertices =5;
		int n =0;
		n = numOfVertices;
		double pow = Math.pow(2, (n * ( n-1) /2));
		
		int ans = (int) Math.round(pow);
		
		System.out.println("Num of undirectd graph : " + ans);
	}
}
