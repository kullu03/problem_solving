package com.eclipse.setup;

import java.util.HashMap;
import java.util.Map;


/**
 * @author Kuldeep Singh
 * 
 * insert/search/delete op in Trie
 *
 */
public class Trie {
	
	private class TrieNode{
		private Map<Character,TrieNode>children;
		private boolean isEndOfWord;
		
		public TrieNode() {
			super();
			this.children = new HashMap<Character,TrieNode>();
			this.isEndOfWord = false;
		}
	}
	
	private TrieNode root;

	public Trie() {
		super();
		this.root = new TrieNode();
	}
	
	
	public void insert(String word) {
		if (root == null) {
			root = new TrieNode();
		}
		for (int i = 0; i < word.length(); i++) {
			Character c = word.charAt(i);
			TrieNode node = root.children.get(c);
			if (node == null) {
				node = new TrieNode();
				root.children.put(c, node);

			} else {
				root.children.put(c, node);
			}

		}
		root.isEndOfWord = true;

	}
	

}
