package com.practice.algorithm.recursion;

public class Palindrome {

	public static void main(String[] args) {
		String s = "isi";
		String ss = "madamimadam";
		System.out.println(isPalindrome(s,0,s.length()-1));
		System.out.println(isPalindrome(ss,0,ss.length()-1));

	}

	private static boolean isPalindrome(String s,int start, int end) {
		// base case
		if(s.isEmpty() || start >= end){
			return true;
		}
	
		
		return (s.charAt(start) == s.charAt(end)) && isPalindrome(s,start +1,end-1);
		
	}

}
