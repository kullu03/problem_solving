package com.intw.practice.tree;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class BoundaryTraversal {

	public static void main(String[] args) {
		// 4 8 10 12 14 20 22 25
		//20 8 4 10 14 25 
		// 20 8 4 10 14 25 22
		//20 8 4 10 14 25 22 
		//20 8 4 10 14 25 22
		BinaryTree1 bt = new BinaryTree1(new Node(20));
		bt.root.left = new Node(8);
		bt.root.right = new Node(22);
		bt.root.right.right = new Node(25);
		bt.root.left.left = new Node(4);
		bt.root.left.right = new Node(12);
		bt.root.left.right.left = new Node(10);
		bt.root.left.right.right = new Node(14);
		bt.root.left.right.right.left = new Node(74);
		//bt.printLeaves(bt.root);
		//bt.printBoundaryTraversal();
		bt.levelWiseSum(bt.root);
	}
}

class Node {
	int data;
	Node left;
	Node right;
	
	public Node(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
}

class BinaryTree1 {
	Node root;

	public BinaryTree1(Node root) {
		this.root = root;
	}

	public void printBoundaryTraversal() {
		// print left sub tree leaving leaf node
		// print leaves
		// print right sub tree leaving leaf node
		Node temp = this.root.left;
		Node right = this.root.right;
		System.out.print(root.data + " ");
		
		while(temp.left != null && temp.right != null){
			System.out.print(temp.data + " ");
			temp = temp.left;
		}
		
		// print leaves
		printLeaves(this.root);
		
		// print right subtree in bottom to top
	     printRight(right);
		
		
	}

	private void printRight(Node right) {
		if(right.left == null && right.right == null){
			return ;
		}
			printRight(right.right);
			System.out.print(right.data + " ");
		
	}

	// code from  career cup
	public void printBorder(Node node, boolean leftMost, boolean rightMost) {
		if (node == null)
			return;
		if (leftMost || rightMost || (node.left == null && node.right == null))
		System.out.print(node.data + " ");
		printBorder(node.left, leftMost, false);
		printBorder(node.right, false, rightMost);
	}
	
	
	public void printLeaves(Node root) {
		if (root == null)
			return;
		printLeaves(root.left);
		if(root.left == null && root.right == null){
		System.out.print(root.data + " ");
		}
		printLeaves(root.right);
	}
	// this will print level wise sum of BT. Given the node of tree
	
	public void levelWiseSum(Node root){
		
		// root is null 
		if(root == null){
			System.out.println("Root is null .. not a valid input");
			return;
		}

		Queue<Node> queue= new ArrayDeque<>();
		// tree exist 
		// push the current node in stack 
		// take size of stack 
		// while size is not 0
		
		queue.add(root);
		
		while( !queue.isEmpty()){
			int currentQueueSize = queue.size();
			int levelSum = 0;
			while(currentQueueSize != 0){
				Node temp = queue.remove();
				levelSum = levelSum + temp.data;

				if(temp.left != null){
					queue.add(temp.left);			
				}

				// if right node is not null push it into in the stack
				if(temp.right != null){
					queue.add(temp.right);
				}
				
				currentQueueSize  = currentQueueSize  -1;
			}
			System.out.println(levelSum);
		}
		
		
		
		
		
	}

}