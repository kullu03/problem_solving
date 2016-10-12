package com.intw.practice.string;

import java.util.Arrays;

public class LongestSubString {
	
	public static void main (String [] args){
		
		System.out.println(getLongestSubstring("abcadbef"));
		System.out.println(getLongestSubstring("abac"));
		System.out.println(getLongestSubstring("aaaaa"));
		System.out.println(getLongestSubstring("abccdefgh"));
	
	}
	
	
	private static String getLongestSubstring(String input){
		
		if(input == null || input.isEmpty()){
			return "";
		}
		
		StringBuilder currentMaxLenSubString = new StringBuilder();
		StringBuilder prevMaxLenSubString = new StringBuilder();
		boolean [] chars = new boolean[256];
		Arrays.fill(chars, false);
		
		for(int i = 0; i < input.length(); i++){
			
			if(!chars[input.charAt(i)]){
				chars[input.charAt(i)] = true;
				currentMaxLenSubString.append(input.charAt(i));
			}
			else{

				// now get to the previous occurrence  of duplicate
				 i = goToPrevOccurenceOfDuplicate(input,i-1,input.charAt(i));
				Arrays.fill(chars, false);
				if(currentMaxLenSubString.length() > prevMaxLenSubString.length()){
					prevMaxLenSubString = currentMaxLenSubString;
				}
				currentMaxLenSubString = new StringBuilder();
			}
			
		}
		
		return currentMaxLenSubString.length() >= prevMaxLenSubString.length() ? currentMaxLenSubString.toString() : prevMaxLenSubString.toString();
		
		
	}


	private static int goToPrevOccurenceOfDuplicate(String input, int i,char c) {
		for(int k = i; k >=0 ;k--){
			if(input.charAt(k)==c)return k;
		}
		
		
		return i;
	}

}
