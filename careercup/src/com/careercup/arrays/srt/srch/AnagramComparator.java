package com.careercup.arrays.srt.srch;
import java.util.Arrays;
import java.util.Comparator;

public class AnagramComparator implements Comparator<String> {
	public String sortChars(String s){

		char [] contents = s.toCharArray();
		Arrays.sort(contents);
		return new String(contents);
	}

	@Override
	public int compare(String s1, String s2) {
		return sortChars(s1).compareTo(sortChars(s2));

	}

	public static void main (String [] args){

		String [] array = new String [] {"Kuldeep","deepKul","eepdluK","abcde","aabcde"
				,"abcdefgh","abcdea"};

		Arrays.sort(array,new AnagramComparator());
		System.out.println(array);	
	}	
}
