package com.intw.practice.tree;

public class BinarySearchTree<T> {
	
	protected BSTNode<T> root;
	
	public BinarySearchTree(BSTNode<T> root){
		this.root = root;
	}
	
	public BSTNode<T> addLeftChild(BSTNode<T> src,BSTNode<T> target){
		src.left = target;		
		return target;		
	}
	public BSTNode<T> addRightChild(BSTNode<T> src,BSTNode<T> target){
		src.right = target;		
		return target;		
	}
	
	

}

class BSTNode<T>{
	BSTNode<T> left;
	BSTNode<T> right;
	T value;
	public BSTNode(T value){
		this.value = value;
		this.left = null;
		this.right = null;
	}
}
