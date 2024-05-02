package com.binary.tree;

public class MaxPathSum {
	public static void main(String[] args) {
		
		int arr[] = { 1, 2, 3, 4, -1,-1,-1,-1 };
				//int [] arr = {1 ,2 ,3 ,4 ,7 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1};

				Node createNode = createNode(arr);
				System.out.println("Max path sum :"+ maxPathSum(createNode));
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
	public static int findMaxPathSum(Node root ,int [] maxi) {
		
		if(root == null)
			return 0;
		
		int leftMaxPath = Math.max(0, findMaxPathSum(root.left, maxi));
		int rightMaxPath = Math.max(0, findMaxPathSum(root.right, maxi));
		
		maxi[0] = Math.max(maxi[0], leftMaxPath + rightMaxPath + root.data);
		
		return Math.max(leftMaxPath, rightMaxPath) + root.data;
	}
	public static int maxPathSum(Node root) {
		int[] maxi = { Integer.MIN_VALUE};
		findMaxPathSum(root, maxi);
		return maxi[0];
	}
}
