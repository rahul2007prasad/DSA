package com.binary.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class IterativeTreeOrderTraversal {
	public static void main(String[] args) {
		
	}
	
	public static List<Integer> iterativePreOrderTraversal(Node root) {
		List<Integer> preOrder = new ArrayList<>();
		
		if(root == null)
			return preOrder;
		
		Stack<Node> stack = new Stack<>();
		stack.push(root);
		
		while(!stack.isEmpty()) {
			root = stack.pop();
			preOrder.add(root.data);
			if(root.right != null)
				stack.push(root.right);
			
			if(root.left != null)
				stack.push(root.left);
			
		}
		return preOrder;
	}
	
	public static List<Integer> iterativePostOrder(Node root){
		List<Integer> postOrder = new ArrayList<>();
		if(root == null)
			return postOrder;
		Stack<Node> st = new Stack<>();
		st.push(root);
		
		
		while(!st.isEmpty()) {
			root = st.pop();
			if(root.left != null)
				st.push(root.left);
			if(root.right !=null)
				st.push(root.right);
			
			postOrder.add(root.data);
		}
		return postOrder;
	}
}
