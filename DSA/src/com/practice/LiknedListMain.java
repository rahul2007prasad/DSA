package com.practice;

public class LiknedListMain {

	static class Node {
		int data;
		Node next;
	}

	static class LinkedList {
		Node head;
		Node tail;
		int size;

		private int size() {
			return size;
		}
		
		private int getFirst() {
			if(size == 0) {
				System.out.println("No element present");
				return -1;
			}else {
				return head.data;
			}
		}
		
		private int getLast() {
			if(size == 0) {
				System.out.println("Empty no element present");
				return -1;
			}
			else {
				return tail.data;
			}
		}
		
		private int getAtIndex(int idx) {
			if(idx < 0 && idx >size) {
				System.out.println("Invalid index");
				return -1;
			}else if(size == 0) {
				System.out.println("No element present");
				return -1;
			}else {
				Node temp = head;
				for(int  i =0 ; i < idx ; i++) {
					temp = temp.next;
				}
				return temp.data;
			}
		}

		private void addLast(int val) {
			Node temp = new Node();
			temp.data = val;
			temp.next = null;
			if (size == 0) {

				head = tail = temp;
				

			} else {
				tail.next = temp;
				tail = temp;
				
			}
			size++;

		}

		private void removeFirst() {
			if (size == 0) {
				System.out.println("No element to remove");
			} else if (size == 1) {
				head = tail = null;
			} else {
				head = head.next;
				size--;
			}
		}
		
		private void addFirst(int val) {
			Node temp = new Node();
			temp.data = val;
			temp.next = head;
			head = temp;
			if(size == 0) {
				tail = temp;
			}
			size++;
			
		}
		
		private void addAtIndex(int val , int idx) {
			if(idx < 0 && idx > size) {
				System.out.println("Invalid arguments");
				
			}else if(size == 0) {
				addFirst(val);
			}else if(idx == size) {
				addLast(val);
			}else {
				Node node = new Node();
				node.data = val;
				Node temp = head;
				
				for(int i = 0 ; i < idx -1 ; i++) {
					temp = temp.next;
				}
				node.next = temp.next;
				temp.next = node;
				size++;
			}
		}
		
		private void removeLast() {
			if(size == 0) {
				System.out.println("No element empty list");
			}else if(size == 1) {
				head = tail = null;
			}else {
				Node temp = head;
				for(int i= 0 ; i < size -2 ; i++) {
					temp = temp.next;
				}
				tail = temp;
				temp.next = null;
				size--;
			}
		}
		
		private Node getNodeAt(int idx) {
			Node temp = head;
			for(int i =0 ; i < idx ; i++) {
				temp = temp.next;
			}
			return temp;
		}
		
		
		private void reverseLLUsingData() {
			int li= 0;
			int ri = size -1;
			while(li < ri) {
				
				Node left = getNodeAt(li);
				Node right = getNodeAt(ri);
				int temp = left.data;
				left.data = right.data;
				right.data = temp;
				li++;
				ri--;
			}
		}
		
		private void reverseLLUsingPointers() {
			Node prev=null;
			Node curr = head;
			
			while(curr != null ) {
				Node next = curr.next;
				curr.next = prev;
				
			}
			Node temp = head;
			head = tail;
			tail = temp;
		}
		
		private void removeAt(int idx) {
			if(idx < 0 && idx > size) {
				System.out.println("Invalid argument");
			}else if(idx == 0) {
				removeFirst();
			}else if(idx == size -1) {
				removeLast();
			}else {
				Node temp = head;
				for(int i = 0 ; i < idx-1 ; i++) {
					temp = temp.next;
				}
				temp.next = temp.next.next;
				size--;
			}
		}
		

		private void display() {
			Node temp = head;
			while (temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.next;
			}
			System.out.println(" ");
		}

	}

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.display();
		ll.addLast(1);
		ll.addLast(2);
		ll.addLast(3);
		ll.addLast(4);
		ll.addLast(5);
		ll.display();
		System.out.println("Get first : " + ll.getFirst());
		
		System.out.println("Get Last : " + ll.getLast());
		System.out.println("Get at index : " + ll.getAtIndex(3));
		
		
		
	}
}
