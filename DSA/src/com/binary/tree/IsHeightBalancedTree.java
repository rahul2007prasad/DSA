package com.binary.tree;

import com.binary.tree.Node;

public class IsHeightBalancedTree {
	public static void main(String[] args) {
int arr[] = {1,2,3,4,5,6,7};
		
		Node createNode = createNode(arr);
		boolean balanced = isBalanced(createNode);
		System.out.println("Is balanced :" + balanced);
	}
	public static Node createNode(int arr[]) {
		Node root = new Node(arr[0]);
		root.left=new Node(arr[1]);
		root.left.left=new Node(arr[3]);
		root.left.right = new Node(arr[4]);
		root.right= new Node(arr[2]);
		root.right.left= new Node(arr[5]);
		root.right.right = new Node(arr[6]);
		return root;
	}
	public static boolean isBalanced(Node root) {
		if(root == null)
			return true;
		
		int leftHeight = getHeight(root.left);
		int rightHeight = getHeight(root.right);
		
		if(Math.abs(leftHeight - rightHeight) <= 1 &&
			isBalanced(root.left) && isBalanced(root.right)){
				return true;
			}
		
		return false;
	}
	public static int getHeight(Node root){ 
		
		if(root == null)
			return 0;
		
		int leftHeight = getHeight(root.left);
		int rightHeight = getHeight(root.right);
		
		return Math.max(leftHeight, rightHeight)+1;
	}
}
