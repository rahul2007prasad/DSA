package com.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class GraphLevelOrderTrversal {
	public static void main(String[] args) {
		
		ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
		for(int i =0; i < 5 ; i ++) {
			adj.add(new ArrayList<>());
		}
		
		
		
		
		
	}
	
	public static ArrayList<Integer> bfsOfGraph(int V , ArrayList<ArrayList<Integer>> adj){
		ArrayList<Integer> bfs = new ArrayList<Integer>();
		boolean vis[] = new boolean[V];
		Queue<Integer> queue = new LinkedList<Integer>();
		
		queue.add(0);
		vis[0] = true;
		
		while (!queue.isEmpty()) {
			Integer node = queue.poll();
			
			bfs.add(node);
			
			for(Integer it : adj.get(node)) {
				if(vis[it] == false) {
					vis[it] = true;
					queue.add(it);
				}
			}
		}
		return bfs;
	}
}
