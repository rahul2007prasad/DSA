package com.binary.tree;

public class NumberOfNodes {

	public static void main(String[] args) {
		int level= 4;
		int maxNumOfNodesOnLevel = maxNumOfNodesOnLevel(level);
		System.out.println("maximum number of Nodes at level :"+ maxNumOfNodesOnLevel);
	}
	
	public static int maxNumOfNodesOnLevel(int n) {
		
		if(n==0)
			return 0;
		
		return (int)Math.pow(2, n-1);
		
		//return (1 << (n-1));  //working using bit also
	}
}
