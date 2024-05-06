package com.binary.tree;

import java.util.ArrayList;
import java.util.List;

public class LeftRightViewOfBinaryTree {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7};
		Node createNode = CreateTree.createNode(arr);
		
		
		// Bbute force : O(N)
		System.out.println("Right view");
		List<Integer> rightView = rightView(createNode);
		for(int node : rightView)
			System.out.print(node + " ");
		
		System.out.println();
		System.out.println("Left view");
		List<Integer> leftView = leftView(createNode);
		for(int nodeLeft : leftView)
			System.out.print(nodeLeft + " ");
		
		
		
		//Optimal 
		
		
		
	}
	
	public static List<Integer> rightView(Node root) {
		List<Integer> res = new ArrayList<Integer>();
		recursionRight(root , 0 , res);
		return res;
	}
	public static List<Integer> leftView(Node root){
		List<Integer> res = new ArrayList<Integer>();
		recursionLeft(root , 0 , res);
		return res;
	}
	
	public static void recursionLeft(Node root , int level, List<Integer> res) {
		if(root == null)
			return;
		
		if(res.size() == level)
			res.add(root.data);
		
		recursionLeft(root.left , level +1 , res);
		recursionLeft(root.right, level + 1, res);
	}
	
	public static void recursionRight(Node root , int level ,List<Integer> res) {
		if(root == null)
			return;
		
		if(res.size() == level)
			res.add(root.data);
		
		recursionRight(root.right, level+1, res);
		recursionRight(root.left, level +1, res);
	}
}
