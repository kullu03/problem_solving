package com.careercup.arrays.string;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		System.out.println(isAnagram("kuldddeeeep","peeeedluk"));
	}


	// Time complexity: O(N) where N is number of character in String
	// Required space :constant space.
	// will work for string that contains ASCII chars
	
	private static boolean isAnagram(String s1, String s2) {

		// if length of both string's are not equal then they are not anagram of each other	
		if(s1.length() != s2.length())return false;
		
		// array to store the presence of a character with number of occurrences.	
		int []seen = new int[256];

		// initialize the array with zero. Do not need to initialize specifically  since by default element will initialized by 0.
		// Added this is just increase the readability of the code. 
		Arrays.fill(seen, 0);

		// convert each string to lower case if you want to make ABC and aBC as anagram, other wise no need to change the case.  
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();

		//  iterate through the first string and count the occurrences of each character
		for(int i =0; i < s1.length(); i++){
			seen[s1.charAt(i)] = seen[s1.charAt(i)] +1;
		}

		// iterate through second string and if any char has 0 occurrence then return false, it mean some char in s2 is there that is not present in s1.
		// other wise reduce the occurrences by one every time .
		for(int i =0; i < s2.length(); i++){
			if(seen[s2.charAt(i)] ==0)return false;
			seen[s2.charAt(i)] = seen[s2.charAt(i)]-1;
		}

		// now if both string have same occurrence of each character then the seen array must contains all element as zero. if any one has non zero element return false mean there are 
		// some character that either does not appear in one of the string or/and mismatch in occurrences 
		for(int i = 0; i < 256; i++){
			if(seen[i] != 0)return false;
		}
		
		return true;
	}



}
