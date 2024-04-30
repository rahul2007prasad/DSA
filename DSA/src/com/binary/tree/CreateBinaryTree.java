package com.binary.tree;

public class CreateBinaryTree {
	public static void main(String[] args) {
		int [] arr = {11, 22, 3, 54, 15, 23, 21};
		for(int i =0 ; i < arr.length ; i++) {
			Node addNode = addNode(arr[i]);
			System.out.println("node " +addNode.data );
		}
		
		
	}
	
	public static Node addNode(int value) {
		Node root = new Node(value);
		
		if(root == null)
			return new Node(value);
		
		if(value < root.data)
			root.left = addNode(value);
		
		else if(value > root.data)
			root.right = addNode(value);
		
		else
			return root;
		
		return root;
		
	}
}
