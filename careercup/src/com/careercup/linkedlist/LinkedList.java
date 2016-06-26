package com.careercup.linkedlist;

public class LinkedList {
	private Node head;
	
   public LinkedList(Node d){
	   this.head = d; //new Node(d);
   }
   public LinkedList(){
	
   }	
	class Node{
		private Node next;
		private int data;
		public Node(int data){
			this.data = data;
			this.next = null;
		}
	}
		
		public void appendToTail(int data){
			Node end = new Node(data);
			Node n  = head;
			while(n.next != null){
				n = n.next;
			}
			n.next = end;
		}
		
		public void addToHead(int data){
			Node first = new Node(data);
			first.next = head;
			head = first;
			/*if(head != null){
				head.next = first;
				head = head.next;
			}
			else{
				head = first;
			}*/
			
		}
	public static void printList(Node head){
		Node curr = head;
		while(curr != null){
			System.out.println(curr.data + " ");
			curr = curr.next;
			
		}
	}
	
public static int getNthElement(Node head,int n){
	
	
	return 0;
	
}

public static void main(String [] args){
	
	Node head = new LinkedList().new Node(1);
	LinkedList list = new LinkedList(head);
	list.appendToTail(2);
	list.appendToTail(3);
	list.appendToTail(4);
	list.appendToTail(5);
	list.appendToTail(6);
	list.appendToTail(7);
	
	LinkedList list1 = new LinkedList(null);
	//print the list
	list1.addToHead(1);
	printList(list.head);
	
	
}
	
}
