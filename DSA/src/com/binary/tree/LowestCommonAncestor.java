package com.binary.tree;

public class LowestCommonAncestor {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7};
		Node createNode = CreateTree.createNode(arr);
		int p = 4;
		int q= 5;
		
		int lowestAncestor = lowestAncestor(createNode, p, q);
		
		
		//TC : O(N)
		System.out.println("Lowest common ancestor : "+lowestAncestor);
	}
	
	public static int lowestAncestor(Node root , int  p, int q) {
		//System.out.println("root "+ root.data);
		if(root == null) 
			return -1;
		
		if(root.data  ==p || root.data == q)
			return root.data;
		
		int left = lowestAncestor(root.left, p, q);
		int right = lowestAncestor(root.right, p, q);
		
		if(left != -1 && right != -1) 
			return root.data;
		
		if(left != -1) {
			return left;
		}else {
			return right;
		}
		
	}
}
