package com.binary.tree;

import java.util.ArrayList;
import java.util.List;

public class RootToLeafPath {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7};
		Node createNode = CreateTree.createNode(arr);
		List<Integer> path = path(createNode, 6);
	
		System.out.println("path from root to leaf node");
		for(int i = 0 ; i < path.size() ; ++i) {
			System.out.print(path.get(i));
			if(i < path.size() -1)
				System.out.print(" -> ");
		}
	}
	
	public static boolean rootToLeaf(Node root, List<Integer> al ,int k) {
		
		if(root == null)
			return false;
		al.add(root.data);
		
		
		if(root.data == k)
			return true;
		
		if(
				(rootToLeaf(root.left, al, k))|| 
				(rootToLeaf(root.right, al, k))
		   ) {
			return true;
		}
		
		al.remove(al.size() - 1);
		return false;
	}
	
	public static List<Integer> path(Node root , int a){
		List<Integer> al = new ArrayList<Integer>();
		
		if(root == null)
			return al;
		
		rootToLeaf(root, al, a);
		return al;
	}
}
