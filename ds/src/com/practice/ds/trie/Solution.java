package com.practice.ds.trie;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;


public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        Solution se = new Solution();
         Trie trie = se.new Trie();
        List<Integer>nums = new ArrayList<Integer>();
        while(t > 0){
        	String op = sc.nextLine();
        	if(op.trim().equals("")) {
                t--;
                continue;
            }
            
          //  String ss = sc.next();
            String[] nextCommand = op.split("\\s+");
            
            if(nextCommand[0].equalsIgnoreCase("add")){
            	trie.insert(nextCommand[1]);
            	
            }
            else{
            	
            	nums.add(trie.countForPrefix(nextCommand[1]));
            	
            }
            
          
        }
        for(Integer ii : nums){
        	System.out.println(ii);
        }
       
    }
    
    private class Trie {

    	private class TrieNode{
    		 Map<Character,TrieNode>children;
    		 boolean isEndOfWord;
    		 Integer preCount;

    		public TrieNode() {
    			//super();
    			children = new HashMap<Character,TrieNode>();
    			isEndOfWord = false;
    			preCount = 0;
    		}
    	}

    	private final TrieNode root;

    	public Trie() {
    		//super();
    		root = new TrieNode();
    	}


    	 void insert(String word) {
    		TrieNode current = root;
    		
    		for (int i = 0; i < word.length(); i++) {
    			char c = word.charAt(i);
    			TrieNode node = current.children.get(c);
    			if (node == null) {
    				node = new TrieNode();
    				node.preCount = current.preCount + 1;
    				current.children.put(c, node);

    			} 
    			current  = node;

    		}
    		current.isEndOfWord = true;

    	}



    	 boolean search(String word){
    		TrieNode current = root;
    		for(int i =0; i < word.length(); i++){
    			TrieNode node = current.children.get(word.charAt(i));
    			if(node == null){
    				return false;
    			}
    			current = node;
    		}

    		return current.isEndOfWord;
    	}

    	 int countForPrefix(String prefix){
    		int c =0;
    		TrieNode current = root;
    		char ch = 0 ;
    		for(int i =0 ; i< prefix.length(); i++){
    			 ch = prefix.charAt(i);
    			TrieNode child = current.children.get(ch);
    			if(child == null)return c;
    			current = child;
    			
    		}
    
    		return current.preCount;
    		
    		
    	}
    	public void printTrie(){
    		if(root == null){
    			return;
    		}
    		
    		Map<Character,TrieNode> children = root.children;
    		if(children == null){
    			return ;
    		}
    		Queue<Map<Character,TrieNode>> q = new LinkedList<Map<Character,TrieNode>>();
    		q.add(root.children);
    		/*for(Map.Entry<Character, TrieNode>ee: children.entrySet()){
    			System.out.println(ee.getKey());
    			q.add(ee.getValue().children);
    			
    		}*/
    		
    		while(!q.isEmpty()){
    			Map<Character,TrieNode> child = q.poll();
    			Set<Character> myset = child.keySet();
    			System.out.println(myset.toArray(new Character[myset.size()])[0]);
    			q.add(child);
    			
    			
    		}
    		
    	}
    	
    	

    }

}