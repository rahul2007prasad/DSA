package com.binary.tree;

public class ChildrenSumPath {
	public static void main(String[] args) {
		Node root = new Node(3);
        root.left = new Node(5);
        root.right = new Node(1);
        root.left.left = new Node(6);
        root.left.right = new Node(2);
        root.right.left = new Node(0);
        root.right.right = new Node(8);
        root.left.right.left = new Node(7);
        root.left.right.right = new Node(4);
		
		int sumProperty = isSumProperty(root);
		System.out.println("is sum valid :  "+ sumProperty);
	}
	
	public static void childSum(Node root) {
		if(root == null)
			return ;
		
		int child =0;
		
		if(root.left != null) {
			child += root.left.data;
		}
		if(root.right !=null) {
			child += root.right.data;
		}
		if(child >= root.data)
			root.data = child;
		else {
			if(root.left != null) {
				root.left.data = root.data;
			}else if(root.right != null){
				root.right.data = root.data;
				
			}
		}
		
		childSum(root.left);
		childSum(root.right);
		
		int total =0;
		
		if(root.left != null)
			total += root.left.data;
		
		if(root.right != null)
			total += root.right.data;
		
		if(root.left != null || root.right != null)
			root.data = total;
	}
	
	public static int isSumProperty(Node root) {
		
		if(root == null)
			return 1;
		if(root.left == null && root.right == null)
			return 1;
		
		int sum =0;
		if(root.left != null)
			sum = sum + root.left.data;
		
		if(root.right != null)
			sum = sum + root.right.data;
		
		if(root.data == sum &&
				isSumProperty(root.left) == 1 &&
				isSumProperty(root.right) == 1
				) {
			return 1;
		}else {
			return 0;
		}
				
				
				
	}
}
