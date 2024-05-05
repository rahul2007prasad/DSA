package com.binary.tree;

public class Node {

	int data;
	Node left;
	Node right;
	int hd;
	
	Node(int data , Node left , Node right){
		this.data = data;
		this.left = left;
		this.right = right;
	}
	
	Node(int data){
		this.data = data;
		this.left = null;
		this.right = null;
		hd = Integer.MAX_VALUE;
	}
}
