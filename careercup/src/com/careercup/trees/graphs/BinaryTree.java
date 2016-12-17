package com.careercup.trees.graphs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

class BinaryTree<T>{
	TreeNode<T> root;

	public static void main(String[] args) {
		BinaryTree<Integer> tree = buildBinaryTree();

		if (tree.isBalancedBinarySearchTree(tree.root))
			System.out.println("Tree is balanced");
		else
			System.out.println("Tree is not balanced");

		if (tree.isBalancedBinarySearchTree2(tree.root))
			System.out.println("Tree is balanced");
		else
			System.out.println("Tree is not balanced");
		
		tree.getCommonAncesstor();
	}

	public static BinaryTree<Integer> buildBinaryTree() {
		BinaryTree<Integer> tree = new BinaryTree<Integer>(1);
		tree.root.left = new TreeNode<Integer>(2);
		tree.root.right = new TreeNode<Integer>(3);
		tree.root.left.left = new TreeNode<Integer>(4);
		tree.root.left.right = new TreeNode<Integer>(5);
		tree.root.left.left.left = new TreeNode<Integer>(8);
		return tree;
	}
		
		public BinaryTree(T data){
			root = new TreeNode<T>(data);
		}
		
		public BinaryTree(){
			root = null;
		}
		
	@SuppressWarnings("unchecked")
	public TreeNode<Integer> buildMinTreeWithHeight(int[] arr, int startIndex, int endIndex) {
		if (arr == null || arr.length == 0)
			return null;

		if(startIndex == endIndex) return null;
		
		int midIndex = (startIndex + endIndex)/2;
		//TreeNode<Integer> root = new TreeNode<Integer>(midIndex);
		BinaryTree<Integer>bt = new BinaryTree<Integer>(midIndex);
		
		bt.root.left = (TreeNode<Integer>) buildMinTreeWithHeight(arr, startIndex, midIndex -1);
		bt.root.right = (TreeNode<Integer>) buildMinTreeWithHeight(arr,  midIndex + 1, endIndex);
		return (TreeNode<Integer>) bt.root;

		
	}
		
		
		/**
		 *  This solution has O(N2) complexity.
		 * 
		 * @param root1
		 * @return
		 */
		public boolean isBalancedBinarySearchTree(TreeNode<T> root1){
			// Empty tree is balanced binary tree.
		if (root1 == null)
			return true;
			
			if(Math.abs(getMaxHeight(root1.left) - getMaxHeight(root1.right)) > 1){
				return false;
			} 
			
			return  isBalancedBinarySearchTree(root1.left) && isBalancedBinarySearchTree(root1.right);
	
		}
		/**
		 * O(N)
		 * @param root1
		 * @return
		 */
		public boolean isBalancedBinarySearchTree2(TreeNode<T> root1){
			if(root1 == null )return true;
			
			return getMaxHeight(root1) - getMinHeight(root1) <=1;	
		}
		
		
		private int getMaxHeight(TreeNode<T> left) {
			if(left == null) return 0;
			
			return 1 + (getMaxHeight(left.left) >= getMaxHeight(left.right) ?  getMaxHeight(left.left) : getMaxHeight(left.right)) ;
	
		}
		
		private int getMinHeight(TreeNode<T> left) {
			if(left == null) return 0;
			
			return 1 + (getMinHeight(left.left) <= getMinHeight(left.right) ?  getMinHeight(left.left) : getMinHeight(left.right)) ;
	
		}
		
		
		public TreeNode<T> getCommonAncesstor(TreeNode<T> t1, TreeNode<T> t2){
			Set<ArrayList<T>> paths = new HashSet<ArrayList<T>>();
			getPaths(this.root,new ArrayList<T>(),paths);
			
			
		}
		
		
		
		
	private void getPaths(TreeNode<T> treeNode, ArrayList<T> currentPath, Set<ArrayList<T>> paths) {
		if (treeNode == null) {
			return;
		}
		
		currentPath.add(treeNode.data);

		if (treeNode.left == null && treeNode.right == null) {
			paths.add(currentPath);
		} else {
			getPaths(treeNode.left, new ArrayList<>(currentPath), paths);
			getPaths(treeNode.right, new ArrayList<>(currentPath), paths);
		}

	}


}

	/**
        * 
        * 
        * @author Kuldeep Singh
        *
        * @param <T>
        */
		class TreeNode<T>{
			T data;
			TreeNode<T> left;
			TreeNode<T> right;
			public TreeNode(T data){
				this.data = data;
			}
			public TreeNode() {
				// TODO Auto-generated constructor stub
			}	
		}
		
	


