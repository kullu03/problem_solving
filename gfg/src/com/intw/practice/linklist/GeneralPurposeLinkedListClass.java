package com.intw.practice.linklist;

public class GeneralPurposeLinkedListClass {
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
	
	/**
	 * Given two linked lists that represent two large positive numbers.
	 * Subtract the smaller number from larger one and return the difference as
	 * a linked list. Note that the input lists may be in any order, but we
	 * always need to subtract smaller from larger one.
	 * 
	 * It may be assumed that there are no extra leading zeros in input lists.
	 * 
	 * Examples
	 * 
	 * Input : l1 = 1 -> 0 -> 0 -> NULL, l2 = 1 -> NULL Output : 0->9->9->NULL
	 * 
	 * Input : l1 = 1 -> 0 -> 0 -> NULL, l2 = 1 -> NULL Output : 0->9->9->NULL
	 * 
	 * Input : l1 = 7-> 8 -> 6 -> NULL, l2 = 7 -> 8 -> 9 NULL Output : 3->NULL
	 * 
	 * 
	 * 
	 */
	
	public LinkedList<Integer> SubtractTwoList(LinkedList<Integer> firstList,LinkedList<Integer> secondList){
		// Brute force approach
		
		if(firstList == null && secondList == null){
			System.out.println("Not valid input...");
		}
		
		
		int subtractedResult = Math.abs(getNumberFromList(firstList) - getNumberFromList(secondList));
		
		return makeLinkedListFromInteger(subtractedResult);
		
		
		
		
	}

	private LinkedList<Integer> makeLinkedListFromInteger(int num) {
		int remainder = num % 10;
		num = num / 10;
		LinkedList<Integer> ll = new LinkedList<Integer>(new Node<Integer>(remainder));
		while (num > 0) {
			remainder = num % 10;
			num = num / 10;
			/*ll.addNodeAtTail(remainder);*/
			ll.addNodeAtHead(remainder);
		}

		return ll;
	}

	
	private void addNodeAtTail(E e) {
		Node<E> current = this.head;
		if(this.head == null){
			this.head = new Node<E>(e);
			return;
		}
		while (current.next != null) {
			current = current.next;
		}
		current.next = new Node<E>(e);
	}

	private int getNumberFromList(LinkedList<Integer> linkedList) {
		if (linkedList == null || linkedList.head == null)
			return 0;

		Node<Integer> iterator = linkedList.head;
		StringBuilder resultString = new StringBuilder();
		while (iterator != null) {
			resultString.append(iterator.data);
			iterator = iterator.next;
		}

		return Integer.valueOf(resultString.toString());
	}

}
