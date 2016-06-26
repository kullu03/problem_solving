package com.corejava.practice;

import java.util.StringTokenizer;

public class Tokenizer {
	
	public static void main(String[] args){
		
		String s = "Kuldeep SIngh Saini";
		
		StringTokenizer st = new StringTokenizer(s, " ");
		
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}
		
		
	}

}
