package com.intw.practice.array;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class NumberOccuringOddNumbers {

	public static void main(String[] args) {
	
		// find numbers occurring odd number time
		
		int arr [] = {1,1,3,2,2,4,5,4,5,8,11,11};
		System.out.println(getTheNumbersOccuringOddNumber(arr));
		System.out.println(getTheNumbersOccuringOddNumber1(arr));

	}

	
	private static int getTheNumbersOccuringOddNumber(int[] arr) {
		int res = 0;
		for(int i = 0; i < arr.length ; i++){
			res = res ^ arr [i];
		}
		
		// validate if only one number exist that has odd number times
		return res;
	}
	
	// Hashing Approach
	private static int getTheNumbersOccuringOddNumber1(int[] arr) {

		Map<Integer,Integer>map = new HashMap<>();
		int res = -1;
		
		for(int i = 0; i < arr.length ; i++){
			
			if(map.get(arr[i]) == null){
				map.put(arr[i], 1);
			}
			else{
				map.put(arr[i],map.get(arr[i]) + 1);
			}
		}
		
		
		for(Entry<Integer, Integer> e : map.entrySet()){
			if(e.getValue() % 2 == 1){
				return e.getKey();
			}
		}
	
		return res;
	}

}
