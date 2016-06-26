package com.careercup.arrays.string;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		System.out.println(removeDupes1("cccbbccc"));
		System.out.println(removeDupes2("cccbbccc"));

	}

	private static String removeDupes(char[]str) {
		boolean [] hit = new boolean[256];
		hit[str[0]] = true;
		int j =1;
		for(int i = 1; i < str.length;++i){
			if(!hit[str[i]]){
					str[j]= str[i];
					++j;
					hit[str[i]]=true;
				}
		}
		str[j]=0;
		return new String(str);

	}
	
	private static String removeDupes1(String str){
		Set<Character> charSet = new LinkedHashSet<>();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < str.length(); i++){
			charSet.add(str.charAt(i));
			
		}
		
		for(Character c : charSet){
			sb.append(c);
		}
		
		return sb.toString();
	}
	
	private static String removeDupes2(String str){
		StringBuilder output = new StringBuilder();
		for(int i = 0; i < str.length(); i++){
			for(int j = i+1; j < str.length(); j++){
				if(output.charAt(i) != str.charAt(j)){
					output.append(str.charAt(j));
				}
			}
		}
		
		return output.toString();
	}

}
