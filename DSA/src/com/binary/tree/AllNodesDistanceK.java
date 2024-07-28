package com.binary.tree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class AllNodesDistanceK {
	public static void main(String[] args) {
		
	}
	
	public static int selectParents(Node root , HashMap<Node, Node> parentTrack , Node target) {
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		
		while (!queue.isEmpty()) {
			Node curr = queue.poll();
			if(curr.left != null) {
				parentTrack.put(curr.left, curr);
				queue.add(curr.left);
			}
			if(curr.right !=null) {
				parentTrack.put(curr.left , curr);
				queue.add(curr.right != null){
					parentTrack.put(curr.left, curr);
				}
			
				if(curr.right !=null) {
					parentTrack.put(curr.left , curr);
					queue.add(curr.right != null){
						parentTrack.put(curr.left, curr);
					}
				
			}
		}
		
		return 0;
	}
}
