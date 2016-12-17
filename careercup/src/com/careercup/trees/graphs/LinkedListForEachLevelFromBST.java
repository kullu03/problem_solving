package com.careercup.trees.graphs;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

import com.careercup.linkedlist.LinkedList;


public class LinkedListForEachLevelFromBST {

	public static void main(String[] args) {
		BinaryTree<Integer> bt = new BinaryTree<>();
		bt = BinaryTree.buildBinaryTree();
		List<LinkedList>lists = getLinkedListFromBST(bt);
		
		
		
	}
	
	private static  List<LinkedList> getLinkedListFromBST(BinaryTree<Integer> bt) {
		List<LinkedList> results = new ArrayList<>();
		Deque<TreeNode> queue = new ArrayDeque<TreeNode>();
		queue.push(bt.root);
		while(!queue.isEmpty()){
			int currentQueueSize = queue.size();
			while (currentQueueSize > 0){
				TreeNode node = (TreeNode)queue.remove();
				LinkedList ll = new LinkedList(new Node((Integer)(node.data)));
				
			}
			
		}
		
		
		
	}

	
	
	

}
