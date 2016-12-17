package com.intw.practice.array;

import java.util.HashSet;
import java.util.Set;

public class PossiblePalindrome {

	public static void main(String[] args) {
		
		Set<String>ps = getPalindromicSubstring(getSubstring("geeks"));
		for(String in : ps){
			System.out.println(in);
		}

	}
	
	private static Set<String> getPalindromicSubstring(Set<String> substring) {
		Set<String> output = new HashSet<String>();
		for(String input : substring){
			if(isPalindrome(input,0,input.length()-1)){
				output.add(input);
			}
		}
		return output;
		
	}

	private static boolean isPalindrome(String input,int s,int l) {
		if(input == null || input.isEmpty()){
			return true;
		}
		
		if(s >= l){
			return true;
		}
		
		return input.charAt(s) == input.charAt(l) && isPalindrome(input, s+1, l-1);
		
	}

	static Set<String> getSubstring(String str){
		Set<String>substring = new HashSet<String>();
		
		if(str == null || str.isEmpty()){
			return substring;
		}
		
		int lastIndex = str.length();
		for(int startIndex = 0 ; startIndex < lastIndex; startIndex ++ ){
			
			for(int nextToStart = startIndex + 1; nextToStart <= lastIndex; nextToStart ++){
				substring.add(str.substring(startIndex,nextToStart));
			}
		}
		
		return substring;
	}

}
