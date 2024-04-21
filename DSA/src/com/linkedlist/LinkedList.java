package com.linkedlist;

public class LinkedList {
	public static void main(String[] args) {
	
		Node head = null;
		head = insertAtFirst(40, head);
		head = insertAtFirst(30, head);
		head = insertAtFirst(20, head);
		head = insertAtFirst(10, head);
		head = insertAtFirst(0, head);
		
		System.out.println("Insert at first");
		printLinkedList(head);
		
		System.out.println();
		System.out.println("length of LL :" + lengthOfLL( head));
		
		System.out.println("Delete Node" );
		//System.out.println(""+ deleteNode(10, head));
		deleteNode(10, head);
		System.out.println();
		System.out.println("length of LL :" + lengthOfLL( head));
		
		
	}
	
	public static int lengthOfLL(Node head) {
		int count =0;
		Node temp = head;
		while(temp != null) {
			temp = temp.next;
			count++;
		}
		return count;
	}
	
	public static Node insertAtFirst(int value , Node head) {
		Node newNode = new Node(value);
		newNode.next = head;
		head = newNode;
		return head;
	}
	
	public static void printLinkedList(Node head) {
		Node curr = head;
		while(curr !=null) {
			
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
		//System.out.println("null");
	}
	
	public static void deleteNode(int key , Node head) {
		Node temp = head;
		Node prev = null;
		
		//if head is itself to be deleted
		if(temp != null && temp.data== key) {
			head = temp.next; //head changed
			return ;
		}
		while(temp != null && temp.data != key) {
			prev = temp;
			temp = temp.next;
		}
		if(temp ==null)
			return;
		
		prev.next = temp.next;
		
	}
}
