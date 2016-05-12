package com.eclipse.setup;

public class BinaryTreeTest {

	public static void main(String[] args) {
		Node root = new Node(1);
		BinaryTree bt = new BinaryTree(root);
		bt.addLeftNode(new Node(2));
		bt.addRightNode(new Node(3));
		bt.addLeftNode(new Node(4));
		bt.addRightNode(new Node(5));
		bt.addLeftNode(new Node(6));
		bt.addRightNode(new Node(7));
		bt.addLeftNode(new Node(8));
		bt.addRightNode(new Node(10));
		System.out.println(bt.size(root));
		bt.inorderTraversal(root);
	}

}
