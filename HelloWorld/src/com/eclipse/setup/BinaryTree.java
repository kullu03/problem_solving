package com.eclipse.setup;

public class BinaryTree {
	private Node root;
	private Node currentNode;
	 public BinaryTree(Node root){
		 currentNode = root;
		 this.root = root;
	 }
	
	public void addLeftNode(Node node){
		currentNode.setLeft(node);	
		currentNode = node;
	}
	
	public void addRightNode(Node node){
		currentNode.setRight(node);	
		currentNode = node;
	}
	
	public int size(Node root){
		if(root == null){
			return 0;
		}
		else{
			return 1+ size(root.getLeft()) + size(root.getRight());
		}
	}
	
	public void inorderTraversal(Node root){
		if(root == null)return;
		inorderTraversal(root.getLeft());
		System.out.println(root.getNum());
		inorderTraversal(root.getRight());
		
	}

}
