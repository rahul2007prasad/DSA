package com.graph;

import java.util.LinkedList;
import java.util.Queue;

public class BFSUsingAdjacencyList {
	
	public BFSUsingAdjacencyList() {
		// TODO Auto-generated constructor stub
	}
	
	static int vertices;
	LinkedList<Integer>[] adjList;
	
	@SuppressWarnings("unchecked")
	public BFSUsingAdjacencyList(int vertices) {
		// TODO Auto-generated constructor stub
		this.vertices = vertices;
		adjList = new LinkedList[vertices];
		for(int i=0 ; i < vertices ; ++i)
			adjList[i] = new LinkedList<Integer>();
		
	}
	public void addEdge(int u , int v) {
		adjList[u].add(v);
	}
	public  void bfs(int startNode) {
		BFSUsingAdjacencyList ad = new BFSUsingAdjacencyList();
		Queue<Integer> queue = new LinkedList<Integer>();
		boolean[] visited = new boolean[vertices];
		
		visited[startNode] = true;
		while(!queue.isEmpty()) {
			int currentNode = queue.poll();
			System.out.println(currentNode + " ");
			
			for(int neighbour : adjList[currentNode])
				if(!visited[neighbour]) {
					visited[neighbour] = true;
					queue.add(neighbour);
				}
		}
		
	}
	
	public static void main(String[] args) {
		int vertice=5;
		BFSUsingAdjacencyList bfs = new BFSUsingAdjacencyList(vertice);
		bfs.addEdge(0, 1);
		bfs.addEdge(0, 2);
		bfs.addEdge(1, 3);
		bfs.addEdge(1, 4);
		bfs.addEdge(2, 4);
		System.out.println("BFS Traversal : " );
		bfs.bfs(0);
		
	}
}
