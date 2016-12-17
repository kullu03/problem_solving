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

public void reverseListAlt(Node s){
	if(s == null || s.next == null)return;
	
	Node t = s.next;
	reverseListAltUtil(s,s);
	this.head = t;
	
}

private void reverseListAltUtil(Node s,Node p) {
	
	if(s== null || s.next == null) return ;
	
	Node temp = s.next.next;
	s.next.next = s;
	p.next = s.next;
	s.next = temp;
	p = s;
	
	reverseListAltUtil(s.next,p);
	
	
}


public void reverseList(Node current,Node prev){
	if(current == null){
		this.head = prev;;
		return;
	}
	
	Node nextCurrent = current.next;
	current.next = prev;
	prev = current;
	
	reverseList(nextCurrent,prev);
	
	
}

public static void main(String [] args){
	
	Node head = new LinkedList().new Node(1);
	LinkedList list = new LinkedList(head);
	list.appendToTail(2);
	list.appendToTail(3);
	list.appendToTail(4);
	list.appendToTail(5);
	list.appendToTail(6);
	//list.appendToTail(7);

	printList(list.head);
	System.out.println("After reverse alt");
	list.reverseList(list.head, null);
	printList(list.head);
	
	
}
	
}
