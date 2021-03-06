package com.practice.ds.trie;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/**
 * @author Kuldeep Singh
 * 
 *         insert/search/delete op in Trie
 *
 */
public class Trie {
	private final TrieNode root;
	public Trie() {
		root = new TrieNode();
	}

	public void insert(String word) {
		TrieNode current = root;
		for (int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			TrieNode node = current.children.get(c);
			if (node == null) {
				node = new TrieNode();
				current.children.put(c, node);

			}
			current = node;

		}
		current.isEndOfWord = true;

	}

	public boolean search(String word) {
		TrieNode current = root;
		for (int i = 0; i < word.length(); i++) {
			TrieNode node = current.children.get(word.charAt(i));
			if (node == null) {
				return false;
			}
			current = node;
		}

		return current.isEndOfWord;
	}

	public int countForPrefix(String prefix) {
		int c = 0;
		TrieNode current = root;
		char ch = 0;
		for (int i = 0; i < prefix.length(); i++) {
			ch = prefix.charAt(i);
			TrieNode child = current.children.get(ch);
			if (child == null)
				return c;
			current = child;

		}
		if (current.isEndOfWord) {
			c = c + 1;
		}
		Set<Character> keys = current.children.keySet();
		Queue<Character> kk = new LinkedList<Character>();
		kk.addAll(keys);
		while (!kk.isEmpty()) {
			char cc = kk.poll();
			TrieNode child1 = current.children.get(cc);
			if (child1 == null || child1.isEndOfWord) {
				c = c + 1;
			}
	
			if (child1 != null) {
				kk.addAll(child1.children.keySet());
				current = child1;
			}

		}

		return c;
	}

	public void printTrie() {
		if (root == null) {
			return;
		}

		Map<Character, TrieNode> children = root.children;
		if (children == null) {
			return;
		}
		Queue<Map<Character, TrieNode>> q = new LinkedList<Map<Character, TrieNode>>();
		q.add(root.children);

		while (!q.isEmpty()) {
			Map<Character, TrieNode> child = q.poll();
			Set<Character> myset = child.keySet();
			System.out.println(myset.toArray(new Character[myset.size()])[0]);
			q.add(child);

		}

	}
	

	private class TrieNode {
		Map<Character, TrieNode> children;
		boolean isEndOfWord;

		private TrieNode() {
			children = new HashMap<Character, TrieNode>();
			isEndOfWord = false;
		}
	}

}
