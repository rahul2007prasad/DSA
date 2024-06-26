package com.binary.tree;

public class DiameterOfbinaryTree {
	public static void main(String[] args) {

		//int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		int [] arr = {1 ,2 ,3 ,4 ,7 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1};

		Node createNode = createNode(arr);
		int diameterOfBinaryTree = diameterOfBinaryTree(createNode);
		System.out.println("Diameter of tree " + diameterOfBinaryTree);
	
	System.out.println("optimal height :" +diameterOptimal(createNode));
	}

	public static int calculateHeight(Node node) {
		int diameter = 0;
		if (node == null)
			return 0;

		int leftHeight = calculateHeight(node.left);
		int rightHeight = calculateHeight(node.right);

		diameter = Math.max(diameter, leftHeight + rightHeight);

		return 1 + Math.max(leftHeight, rightHeight);

	}

	public static int diameterOfBinaryTree(Node root) {
		int calculateHeight = calculateHeight(root);
		return calculateHeight;
	}

	public static Node createNode(int arr[]) {
		Node root = new Node(arr[0]);
		root.left = new Node(arr[1]);
		root.left.left = new Node(arr[3]);
		root.left.right = new Node(arr[4]);
		root.right = new Node(arr[2]);
		root.right.left = new Node(arr[5]);
		root.right.right = new Node(arr[6]);
		return root;
	}
	
	
	//-----------
	public static int diameterOptimal(Node root) {
		int [] diameter = new int[1];
		diameter[0] = 0;
		height(root , diameter);
		
		return diameter[0];
	}
	public static int height(Node node , int[] diameter) {
		
		if(node  == null)
			return 0;
		int[] lh = new int[1];
		int[] rh = new int[1];
		lh[0] = height(node.left , diameter);
		rh[0] = height(node.right , diameter);
		
		diameter[0] = Math.max(diameter[0],lh[0]+rh[0]);
		
		return 1 + Math.max(lh[0], rh[0]);
	}
	
}
