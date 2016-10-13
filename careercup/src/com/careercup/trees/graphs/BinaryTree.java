package com.careercup.trees.graphs;

class BinaryTree<T>{
		TreeNode<T> root;
		public static void main(String[] args) {
			   BinaryTree<Integer> tree = new BinaryTree<Integer>(1);
		        //tree.root = new Node(1);
		        tree.root.left = tree.new TreeNode<Integer>(2);
		        tree.root.right = tree.new TreeNode<Integer>(3);
		        tree.root.left.left = tree.new TreeNode<Integer>(4);
		        tree.root.left.right = tree.new TreeNode<Integer>(5);
		        tree.root.left.left.left = tree.new TreeNode<Integer>(8);
		  
		        if(tree.isBalancedBinarySearchTree(tree.root))
		            System.out.println("Tree is balanced");
		        else
		            System.out.println("Tree is not balanced");
		        
		        if(tree.isBalancedBinarySearchTree2(tree.root))
		            System.out.println("Tree is balanced");
		        else
		            System.out.println("Tree is not balanced");
		    }
		
		public BinaryTree(T data){
			root = new TreeNode<T>(data);
		}
		
		/**
		 *  This solution has O(N2) complexity.
		 * 
		 * @param root1
		 * @return
		 */
		public boolean isBalancedBinarySearchTree(TreeNode<T> root1){
			// Empty tree is balanced binary tree.
			if(root1 == null)return true;
			
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



		class TreeNode<T>{
			T data;
			TreeNode<T> left;
			TreeNode<T> right;
			public TreeNode(T data){
				this.data = data;
			}
			
		}
		
	

}
