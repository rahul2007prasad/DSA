package com.binary.tree;

public class HeightOfBinaryTree {
	public static void main(String[] args) {
		//int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		int arr[] = { 3 ,-1 ,1 ,2 ,-1 ,-1 ,-1};

		Node createNode = createNode(arr);
		System.out.println("Height : "+heightOfBinaryTree(createNode));
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

	public static int heightOfBinaryTree(Node root) {

		if (root == null)
			return 0;

		int lh = heightOfBinaryTree(root.left);
		int rh = heightOfBinaryTree(root.right);

		return 1 + Math.max(lh, rh);
	}
}
