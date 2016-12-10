package com.intw.practice.heap;

public class IsTreeHeap {

	public static void main(String[] args) {
		Node root = new Node(10);
        root.left = new Node(9);
        root.right = new Node(8);
        root.left.left = new Node(7);
        root.left.right = new Node(6);
        root.right.left = new Node(5);
        root.right.right = new Node(4);
        root.left.left.left = new Node(3);
        root.left.left.right = new Node(2);
        root.left.right.left = new Node(1);

        BinaryTree bt = new BinaryTree(root);
        System.out.println(bt.isBinaryTreeHasMaxHeapProp());
        
        
	}

}

class BinaryTree {
	Node root;

	public BinaryTree(Node root) {
		this.root = root;
	}

	public boolean isBinaryTreeHasMaxHeapProp() {
		// Binary tree must be height balanced
		// Tree should have max heap property.

		// if tree is null or tree having only root.
		if (this.root == null || (this.root.left == null && this.root.right == null)) {
			return true;
		}

		// check if tree is not balanced

		if(!isBalanceTree()){
			return false;
		}
		
		// now check if max heap property is maintained
		
		return isMaxHeapPropertyMaintained(this.root);


	}

	private boolean isMaxHeapPropertyMaintained(Node  root) {
		
		if(root == null){
			return true;
		}
		
		if(root.left != null){
			if(root.data < root.left.data){
				return false;
			}
			
		}
		
		if(root.right != null){
			if(root.data < root.right.data){
				return false;
			}
		}
		
		return isMaxHeapPropertyMaintained(root.left) && isMaxHeapPropertyMaintained(root.right);
		
	}

	private boolean isBalanceTree() {

		// if tree is null or tree having only root.
		if (this.root == null || (this.root.left == null && this.root.right == null)) {
			return true;
		}

		int maxHeight = getMaxHeight(this.root);
		int minHeight = getMinHeight(this.root);
		return (maxHeight - minHeight <= 1);
	}

	private int getMinHeight(Node root) {
		// if tree is null or tree having only root.
		if (root == null) {
			return 0;
		}
		

		int left = getMaxHeight(root.left) +1;
		int right = getMaxHeight(root.right) +1;
		int max = left <= right ? left : right;
		return max;
		

	}

	private int getMaxHeight(Node root) {
		// if tree is null or tree having only root.
		if (root == null) {
			return 0;
		}

		int left = getMaxHeight(root.left) +1;
		int right = getMaxHeight(root.right) +1;
		int max = left >= right ? left : right;
		return max;
	}
}

class Node {
	int data;
	Node left;
	Node right;

	public Node(int data) {
		this.data = data;
		left = null;
		right = null;
	}


	
	
	
}
