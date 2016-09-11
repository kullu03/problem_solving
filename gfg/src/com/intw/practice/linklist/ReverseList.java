package com.intw.practice.linklist;

public class ReverseList {
	public static void main(String [] args) {
		LinkedList<String>ll = new LinkedList<String>(new Node<String>("Kuldeep"));
		ll.addNodeAtHead("Singh");
		ll.addNodeAtHead("Sultanpur");
		/*ll.addNodeAtHead("Saini");
		ll.addNodeAtHead("Manu");
		ll.addNodeAtHead("At");*/
		//ll.addNodeAtHead("Bangalore");
		
		ll.printList();
		ll.reverse();
		System.out.println("List reveresed!!!");
		ll.printList();
	}

}


class Node<E>{
	E data;
	Node<E> next;

	public Node(E data){
		this.data = data;
		this.next = null;		
	}
}

class LinkedList<E>{
	Node<E> head;

	public LinkedList(Node<E>node){
		this.head = node;
	}

	public void addNodeAtHead(E data){
		Node<E> head = this.head;
		if(head == null){
			this.head = new Node<E>(data);
			return;
		}
		// if head is not null

		// create the new node with given data
		Node<E> currentNode = new Node<E>(data);

		// add head to the next of new node
		currentNode.next = head;

		// make the new node as head
		this.head = currentNode;

	}

	public void printList(){
		Node<E> iterator = this.head;
		while(iterator != null){
			System.out.println(iterator.data);
			iterator = iterator.next;
		}
	}

	public void reverse(){

		Node<E> oldHead = this.head;
		Node<E> newHead = null;

		if(oldHead == null){
			System.out.println("Given linked list is empty..");
			return;
		}

		while(oldHead != null){

		/*	// if this is first node then
			if(newHead == null){
				newHead = oldHead;
				oldHead = oldHead.next;
				newHead.next = null;
			}
			else{*/
				Node<E> temp = oldHead;
				oldHead = oldHead.next;
				temp.next = newHead;
				newHead = temp;

			//}
		}
		this.head = newHead;

	}

	/**
	 * 
	 * @param newHead is the head node of linked list of after reverse the linked list.
	 * @param currentHead is the current head of given linked list.
	 */
	public void recursiveReverse(Node<E>newHead,Node<E>currentHead){

		// base condition 
		if(currentHead == null)return;
		
		// Inductive step..
		
		// take currentHead in temp node
			Node<E>temp = currentHead;
		// increment currentHead to the next node
			currentHead = currentHead.next;
			
		// link the current node to the already reversed linked list.
			temp.next = newHead;
			
		// make temp node new head.	
			newHead = temp;
		// make it head.
			this.head = newHead;
			
		// now recurse with left list.
			recursiveReverse(newHead,currentHead);

	}

}
