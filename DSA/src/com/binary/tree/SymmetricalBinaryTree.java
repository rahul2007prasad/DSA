package com.binary.tree;

public class SymmetricalBinaryTree {
	public static void main(String[] args) {
		int arr[] = {1,2,2,3,3,4,4};
		Node createNode = CreateTree.createNodeInOrder(arr);
		boolean checkSymmetric = checkSymmetric(createNode);
		
		System.out.println("is symmetric :"+ checkSymmetric);
	
		printInorder(createNode);
	}
	
	public static void printInorder(Node root) {
        if (root == null) {
            return;
        }
        printInorder(root.left);
        System.out.print(root.data + " ");
        printInorder(root.right);
    }
	
	public static boolean isSymmetric(Node root1 , Node root2) {
		
		if(root1 == null || root2 == null)
			return root1 == root2;
		
		return (
				root1.data == root2.data &&
				isSymmetric(root1.left, root2.right) &&
				isSymmetric(root1.right, root2.left)
				);
	}
	
	

	public static boolean checkSymmetric(Node root) {
		if(root == null)
			return true;
		
		return isSymmetric(root.left, root.right);
	}
	
}
