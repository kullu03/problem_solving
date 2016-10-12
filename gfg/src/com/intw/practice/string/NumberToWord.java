package com.intw.practice.string;

import java.util.HashMap;
import java.util.Map;

public class NumberToWord {
	static Map<String,String>tens = new HashMap<String,String>();
	static Map<Integer,String>map = new HashMap<Integer,String>();
	static{
		tens.put("1", "one");
		tens.put("2", "two");
		tens.put("3", "three");
		tens.put("7", "seven");
		
		tens.put("10", "ten");
		tens.put("11", "ten");
		tens.put("12", "ten");
		tens.put("13", "ten");
		tens.put("14", "ten");
		tens.put("15", "ten");
		tens.put("16", "ten");
		tens.put("17", "seventeen");
		
		map.put(1, "hundred");
		map.put(0, "thousand");
	}
	public static void main(String[] args) {
	
		String input = "1007";
		System.out.println(getNumbersInWord(input));
		
	}

	private static String getNumbersInWord(String input) {
		if(input == null || input.isEmpty()){
			throw new IllegalArgumentException("input number is empty or null");
		}
		
		// 
		if(input.length() > 4){
			throw new IllegalArgumentException("input number length is greater than four");
		}
		// validate input remove zero and spaces from input String
		
		StringBuilder output = new StringBuilder();
		
		for(int inputIndex = 0; inputIndex <= input.length()-1;inputIndex++){
			String ss = tens.get(String.valueOf(input.charAt(inputIndex)));
			if(ss != null){
				if(inputIndex == 0 || inputIndex ==1){
					output.append(ss).append(" ").append(map.get(new Integer(inputIndex))).append(" ");
				}
				else if(inputIndex == 2 && input.charAt(inputIndex) != '0'){
					String s = input.substring(2);
					output.append(tens.get(s)).append(" ");
				}
				else{
					output.append(ss).append(" ");
				}
			}
		}
		return output.toString();
	}

}
