package com.binary.tree;

import java.util.ArrayList;
import java.util.List;

public class BoundaryTraversal {
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6,7};
		//CreateTree ct = new CreateTree();
		Node createNode = CreateTree.createNode(arr);
		List<Integer> printBoundry = printBoundry(createNode);
		printResult(printBoundry);
		//addLeaves(createNode, null);
	}
	public static boolean isLeaf(Node root) {
		return root.left == null &&
				root.right == null ;
	}
	
	public static void addLeftBoundary(Node root , List<Integer> res) {
		Node curr = root.left;
		
		while(curr != null) {
			if(!isLeaf(curr))
				res.add(curr.data);
			
			if(curr.left != null) {
				curr = curr.left;
			}else {
				curr = curr.right;
			}
			
		}
	}
	
	public static void addRightBoundary(Node root , List<Integer> res) {
		Node curr = root.right;
		List<Integer> temp = new ArrayList<Integer>();
		
		while(curr != null) {
			if(!isLeaf(curr))
				temp.add(curr.data);
			
			if(curr.right !=null)
				curr = curr.right;
			else
				curr = curr.left;
		}
		for(int i = temp.size()-1 ; i>= 0; --i)
			res.add(temp.get(i));
	}
	
	public static void addLeaves(Node root , List<Integer> res) {
		if(isLeaf(root)) {
			res.add(root.data);
			return;
		}
			if(root.left!= null)
				addLeaves(root.left , res);
			
			if(root.right != null)
				addLeaves(root.right ,res);
		}
	
	public static List<Integer> printBoundry(Node root){
		List<Integer> res = new ArrayList<Integer>();
		if(root == null)
			return res;
		
		if(!isLeaf(root))
			res.add(root.data);
		
		addLeftBoundary(root, res);
		addLeaves(root, res);
		addRightBoundary(root, res);
		return res;
	}
	
	public static void printResult(List<Integer> result) {
		for(int val : result)
			System.out.println(val + " ");
		
		System.out.println();
	}
}
