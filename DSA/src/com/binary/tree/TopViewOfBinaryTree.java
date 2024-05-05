package com.binary.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class TopViewOfBinaryTree {
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6,7};
		CreateTree ct = new CreateTree();
		Node createNode = CreateTree.createNode(arr);
		topView(createNode);
	}
	
	public static ArrayList<Integer> topView(Node root){
		ArrayList<Integer> ans = new ArrayList<Integer>();
		class QueueObj {
			Node node;
			int hd; //horizantal distance
			
			public QueueObj(Node node , int hd) {
				this.node = node;
				this.hd = hd;
				
			}
		}
		
		Queue<QueueObj> q = new LinkedList<QueueObj>();
		Map<Integer, Node> topViewMap = new TreeMap<Integer, Node>();
		
		if(root == null)
			return ans;
		else
			q.add(new QueueObj(root, 0));
		
		//top view of tree...
		
		while(!q.isEmpty()) {
			QueueObj tmpNode = q.poll();
			if(!topViewMap.containsKey(tmpNode.hd))
				topViewMap.put(tmpNode.hd, tmpNode.node);
			
			if(tmpNode.node.left != null)
				q.add(new QueueObj(tmpNode.node.left, tmpNode.hd -1));
			
			if(tmpNode.node.right != null)
				q.add(new QueueObj(tmpNode.node.right, tmpNode.hd +1));
			
		}
		
		 for (Map.Entry<Integer, Node> entry : topViewMap.entrySet()) {
			 ans.add(entry.getValue().data);
            System.out.print(entry.getValue().data + " ");
        }
		 return ans;
		
	}
}
