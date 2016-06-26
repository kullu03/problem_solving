package com.intw.practice.array;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;


public class Duplicates {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		System.out.println(removeUsingNaive(input));

	}

	private static String removeDuplicate(String input) {
		Set<Character>set = new LinkedHashSet<>();
		for(int i =0; i < input.length(); i++){
			set.add(input.charAt(i));
			
		}
		StringBuilder sb = new StringBuilder();
		for(Character c : set){
			sb.append(c);
		}
		return sb.toString();
	}

	private static String removeUsingNaive(String input) {
		StringBuilder sb = new StringBuilder();
		boolean isDup = false;
		for(int i =0; i < input.length(); i++){
			for(int j = i+1; j < input.length(); j++){
				if(input.charAt(i) == input.charAt(j)){
					isDup = true;
					break;
				}
			}
			if(!isDup){
				sb.append(input.charAt(i));
				isDup = false;
			}
			
		}
		
		return sb.toString();
	}
}
