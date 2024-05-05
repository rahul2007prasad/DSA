package com.binary.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.TreeSet;

public class VerticalTraversal {
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6,7};
		Node createNode = CreateTree.createNode(arr);
		
		printVertivalOrdr(createNode);
	}


public static void getVerticalOrder(Node root , int hd , TreeMap<Integer, ArrayList<Integer>> map) {
	if(root == null)
		return;
	ArrayList<Integer> get = map.get(hd);
	
	if(get == null) {
		get = new ArrayList<Integer>();
		get.add(root.data);
	}else {
		get.add(root.data);
	}
	
	map.put(hd, get);
	
	getVerticalOrder(root.left, hd-1, map);
	
	getVerticalOrder(root.right, hd+1, map);
	
		
	}


	public static void printVertivalOrdr(Node root) {
		TreeMap<Integer, ArrayList<Integer>> map= new TreeMap<Integer, ArrayList<Integer>>();
		int hd =0;
		
		getVerticalOrder(root, hd, map);
		
		
		for(Entry<Integer,ArrayList<Integer>> entry : map.entrySet()) {
			System.out.println(entry.getValue());
		}

	}
}