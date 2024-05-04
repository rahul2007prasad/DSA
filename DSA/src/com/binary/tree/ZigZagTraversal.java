package com.binary.tree;

import java.util.ArrayList;
import java.util.List;

public class ZigZagTraversal {
	public static void main(String[] args) {
		
	}
	public static int zigzagTraverse(Node root) {
		
		
		return 0;
	}
	
	public static boolean isLeaf(Node root) {
		return root.left == null && root.right == null;
		
	}
	
	public static void addLeftBoundry(Node root , List<Integer> res) {
		
		Node curr = root.left;
		
		while(curr != null) {
			if(!isLeaf(curr))
				res.add(curr.data);
			if(curr.left !=null) {
				curr = curr.left;
			}
			else {
				curr = curr.right;
			}
		}
	}
	
	public static void addRightBoundry(Node root) {
		Node curr = root.right;
		List<Integer> temp = new ArrayList<Integer>();
		
		if(!isLeaf(curr)) {
			temp.add(curr.data);
		}
		
		if(curr.right != null) {
			curr = curr.right;
		}else {
			curr = curr.left;
		}
	}
	
	
}
