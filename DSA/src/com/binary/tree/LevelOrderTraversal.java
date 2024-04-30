package com.binary.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {
	public static void main(String[] args) {
		
	}
	
	public static List<Integer> levelOrder(TreeNode<Integer> root) {
		Queue<TreeNode<Integer>> queue = new LinkedList<>();
		List<Integer> list = new ArrayList<>();
		
		queue.add(root);
		if(root == null)
			return list;
		
		while(!queue.isEmpty()) {
			TreeNode<Integer> node = queue.poll();
			if(node != null) {
				list.add(node.data);
				queue.add(node.left);
				queue.add(node.right);
			}
		}
		return list;
		
	}
}
