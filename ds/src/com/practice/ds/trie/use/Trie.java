package com.practice.ds.trie.use;

import java.util.HashMap;
import java.util.Map;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class Trie {
	
	private class TrieNode {
		Map<Character, TrieNode> childeren;

		private boolean isEndOFWord;

		TrieNode() {
			childeren = new HashMap<Character, TrieNode>();
			isEndOFWord = false;
		}
	}
	
	private final TrieNode root;
	public Trie (){
		root = new TrieNode();
	}
	
	public void addContact(String contact){
		int n = contact.length();
		TrieNode current = root;
		for(int i = 0; i < n; i++){
			char c = contact.charAt(i);
			if(current.childeren.containsKey(c)){
				current = current.childeren.get(c);
			}
			else{
				current.childeren.put(c, new TrieNode());
			}
			
		}
		current.isEndOFWord = true;
	}
	

}
