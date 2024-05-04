package com.binary.tree;

public class CreateTree {

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
}
