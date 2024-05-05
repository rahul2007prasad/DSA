package com.binary.tree;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;

public class BottomViewTraversal {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7};
		Node createNode = CreateTree.createNode(arr);
		bottomView(createNode);
	}
	
	public static void bottomView(Node root) {
		if(root == null)
			return;
		
		int hd =0;
		
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
		Queue<Node> queue = new LinkedList<Node>();
		
		root.hd = hd;
		queue.add(root);
		
		while(!queue.isEmpty()) {
			Node tmp = queue.remove();
			hd = tmp.hd;
			map.put(hd, tmp.data);
			
			if(tmp.left != null) {
				tmp.left.hd = hd-1;
				queue.add(tmp.left);
			}
			
			if(tmp.right != null) {
				tmp.right.hd = hd +1;
				queue.add(tmp.right);
			}
		}
		
		Set<Entry<Integer , Integer>> set = map.entrySet();
		Iterator<Entry<Integer,Integer>> iterator = set.iterator();
		
		while(iterator.hasNext()) {
			Map.Entry<Integer, Integer> m = iterator.next();
			System.out.println(m.getValue()+"");
		}
		
		
	}
	
	
}
