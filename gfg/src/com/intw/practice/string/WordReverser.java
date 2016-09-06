package com.intw.practice.string;

import java.util.*;
import java.lang.*;
import java.io.*;

/**
 * @author Kuldeep Singh
 *
 */
class WordReverser {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int noOfTestcases = sc.nextInt();

		// Give user option for separator
		String separator = "\\.";
		while(noOfTestcases > 0){

			String str = sc.nextLine();
			String result = reverseWordsOfString(str,separator);
			System.out.println(result);
			if(str != null && !str.isEmpty()){
				noOfTestcases = noOfTestcases-1;
			}
		}

	}

	public static String reverseWordsOfString(String str,String sep){
		// if String it self is null or separator is null then return empty.
		if(str == null || sep == null) return "";

		// now if both are not empty

		String [] strArray = str.split(sep);

		StringBuilder output = new StringBuilder();

		for(int i = 0; i < strArray.length; i++){
			StringBuilder sb = new StringBuilder(strArray[i]);
			output.append(sb.reverse());
			if( i != strArray.length-1){
				output.append(sep);
			}
		}
		return output.toString();
	}
}