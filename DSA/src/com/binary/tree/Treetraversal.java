package com.binary.tree;

public class Treetraversal {

	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7};
		
		Node createNode = createNode(arr);
		inOrderTraversal(createNode);
		System.out.println("");
		preOrderTreeTraversal(createNode);
		System.out.println("");
		postOrderTreeTraversl(createNode);
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
	public static void inOrderTraversal(Node node) {
			
			if(node == null)
				return;
		   inOrderTraversal(node.left);
		   System.out.print(node.data);
		   inOrderTraversal(node.right);
		
	}
	
	public static void preOrderTreeTraversal(Node node) {
		if(node ==null)
			return;
		System.out.print(node.data);
		preOrderTreeTraversal(node.left);
		preOrderTreeTraversal(node.right);
					
	}
	
	public static void postOrderTreeTraversl(Node node) {
		if(node == null)
			return;
		postOrderTreeTraversl(node.left);
		postOrderTreeTraversl(node.right);
		System.err.print(node.data);
	}
}
