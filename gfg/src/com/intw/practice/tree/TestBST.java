package com.intw.practice.tree;

public class TestBST {

	public static void main(String[] args) {
		BinarySearchTree<Integer>bst = new BinarySearchTree<>(new BSTNode<Integer>(20));
		/*
		 * 					20 
		 * 					/       \
		 * 					17        30  
		 * 					/  \         /  \
		 * 				   14   18      25     35 
		 * 					/\          / \      / \
		 * 				  13 16        24  26    34  40
		 *                                           /  \
		 *                                           39  50
		 * 
		 */
		bst.addLeftChild(bst.root, new BSTNode<Integer>(17));
		bst.addRightChild(bst.root, new BSTNode<Integer>(30));

	}

}
