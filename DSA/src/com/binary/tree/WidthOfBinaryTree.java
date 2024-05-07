package com.binary.tree;

public class WidthOfBinaryTree {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7};
		Node createNode = CreateTree.createNode(arr);
		int maxWidth = getMaxWidth(createNode);
		System.out.println("max width :" + maxWidth);
	}
	public static int getMaxWidth(Node root) {
		int maxWidth = 0;
		int width;
		int h = height(root);
		
		for(int i = 1 ;  i <= h ; i++) {
			width =  getWidth(root , i);
			if(width > maxWidth)
				maxWidth = width;
		}
		return maxWidth;
	}
	
	public static int getWidth(Node root , int level) {
		if(root == null)
			return 0;
		
		if(level ==1 ) {
			return 1;
		}else if(level >1) {
			return getWidth(root.left , level - 1) + getWidth(root.right , level -1);
		}
		return 0;
	}
	
	public static int height(Node root) {
		if(root == null)
			return 0;
		else {
			int lHeight = height(root.left);
			int rHeight = height(root.right);
			
			return (lHeight > rHeight) ? (lHeight +1) : (rHeight +1);
		}
	}
}
