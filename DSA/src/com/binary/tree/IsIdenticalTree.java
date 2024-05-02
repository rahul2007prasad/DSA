package com.binary.tree;

public class IsIdenticalTree {
	public static void main(String[] args) {
		int arr1[] = { 1, 2, 3, 4, -1,-1,-1,-1 };
		int [] arr2 = {1 ,2 ,3 ,4,5,-1 ,-1 ,-1 ,-1};

		Node createNode1 = createNode(arr1);
		Node createNode2 = createNode(arr2);

		System.out.println("Max path sum :"+ checkIdenttical(createNode1 , createNode2));

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
	public static boolean checkIdentical(Node node1 , Node node2) {
		
		if(node1 == null && node2 == null) {
			return true;
		}
		if(node1 == null || node2 == null)
			return false;
		
		return (
				(node1.data == node2.data) &&
				checkIdentical(node1.left, node2.left) &&
				checkIdentical(node1.right, node2.right)
				);
		
		
		}
	
}
