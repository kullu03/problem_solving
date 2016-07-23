package com.intw.practice.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoNumberWithSingleSum {

	public static void main(String[] args) {
		
		int [] arr = {2,3,4,1,9,6};
		System.out.println(isTwoNumberExist(arr,9));
		System.out.println(hasTwoNumberWithGivenSum(arr,9));

	}

	// Time complexity O(NLOGN)
	
	private static boolean isTwoNumberExist(int[] arr, int sum) {
		if(arr== null || arr.length==0){
			return false;
		}
		
		// it will take O(NlgN)
		Arrays.sort(arr);
	
		for(int i = 0; i < arr.length;i++){
			if(doBinarySearch(arr,sum-arr[i])){
			  return true;
			}		
		}
		
		return false;
	}
	
	// Time : O(N)
	// Space : O(N)
	private static boolean hasTwoNumberWithGivenSum(int [] arr , int sum){
		Map<Integer,Integer>map = new HashMap<Integer,Integer>();
		
		for(int i = 0; i < arr.length; i++){
			map.put(arr[i],i);		
		}
		
		// Now check if with 
		
		for(int i = 0; i < arr.length; i++){
			
			Integer remainingSum = sum - arr[i];
			if(map.get(remainingSum) != null){
				return true;
			}
		}
		
		return false;
	}

	private static boolean doBinarySearch(int[] arr, int num) {
		
		int start = 0;
		int end = arr.length-1;
		
		while(start <= end){
			int mid = (start + end)/2;
			// best case ..element found
			if(arr[mid] == num) return true;
			
			if(arr[mid] > num){
				end = mid-1;
			}
			
			if(arr[mid] < num){
				start = mid +1;
			}
		}
		
		return false;
	}

}
