package com.intw.practice.tree;

public class BinaryTreeTest {

	public static void main(String[] args) {

		BinaryTree<Integer> bt1 = new BinaryTree<Integer>(new TreeNode<Integer>(1));
		bt1.root.left = new TreeNode<Integer>(2);
		bt1.root.right = new TreeNode<Integer>(3);
		bt1.root.left.left = new TreeNode<Integer>(4);
		bt1.root.left.right = new TreeNode<Integer>(5);

		BinaryTree<Integer> bt2 = new BinaryTree<Integer>(new TreeNode<Integer>(1));
		bt2.root.left = new TreeNode<Integer>(2);
		bt2.root.right = new TreeNode<Integer>(3);
		bt2.root.left.left = new TreeNode<Integer>(4);
		bt2.root.left.right = new TreeNode<Integer>(5);

		System.out.println(bt1.areTreesIdentical(bt1, bt2) ? "Yes" : "No");

	}

}
