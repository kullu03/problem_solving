package com.intw.practice.tree;

import java.util.ArrayDeque;
import java.util.Deque;

public class BinaryTree<T> {
	TreeNode<T> root;

	public BinaryTree(TreeNode<T> root) {
		this.root = root;
	}

	public boolean areTreesIdentical(BinaryTree<T> t1, BinaryTree<T> t2) {
		if (t1 == null && t2 == null) {
			return true;
		}
		if (t1 != null && t2 == null) {
			return false;
		}

		if (t1 == null && t2 != null) {
			return false;
		}

		// Both trees are not null.

		Deque<TreeNode<T>> s1 = new ArrayDeque<>();
		Deque<TreeNode<T>> s2 = new ArrayDeque<>();
		s1.push(t1.root);
		s2.push(t2.root);

		while (!s1.isEmpty() && !s2.isEmpty()) {

			if (s1.isEmpty() && !s2.isEmpty()) {
				return false;
			}

			if (s2.isEmpty() && !s1.isEmpty()) {
				return false;
			}

			TreeNode<T> tt1 = s1.pop();
			TreeNode<T> tt2 = s2.pop();

			if (!tt1.data.equals(tt2.data))
				return false;

			if (tt1.left != null) {
				s1.push(tt1.left);
			}

			if (tt1.right != null) {
				s1.push(tt1.right);
			}

			if (tt2.left != null) {
				s2.push(tt2.left);
			}

			if (tt2.right != null) {
				s2.push(tt2.right);
			}

		}

		return true;
	}
}

// Tree node structure.

class TreeNode<T> {
	TreeNode<T> left;
	TreeNode<T> right;
	T data;

	public TreeNode(T data) {
		this.data = data;
		left = null;
		right = null;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TreeNode<T> other = (TreeNode<T>) obj;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		return true;
	}
	
	

}
