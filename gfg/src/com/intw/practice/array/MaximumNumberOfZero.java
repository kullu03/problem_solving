package com.intw.practice.array;

public class MaximumNumberOfZero {

	public static void main(String[] args) {
		
		
		System.out.println(getMaxZeroCountByFlippingLargestSubarray(new int []{0,1,0,0,1,1,0}));
		//System.out.println(getMaxZeroCountByFlippingLargestSubarray(new int []{0,1,0,0,1,1,1}));
		System.out.println(getMaxZeroCountByFlippingLargestSubarray(new int []{1,1,1,1}));
		System.out.println(getMaxZeroCountByFlippingLargestSubarray(new int []{0,0,0,0}));

	}

	private static int getMaxZeroCountByFlippingLargestSubarray(int[] arr) {
		
		if(arr == null || arr.length == 0){
			return -1;
		}
		
		// result will count of zeros + size of maximum non zero sub array
		
		int zeroCount  = 0;
		for(int i = 0; i< arr.length; i++){
			if(arr[i] == 0) {
				zeroCount = zeroCount +1;
			}
		}
		
		int currentSize = 0;
		int maxSizeSoFar = 0;
		
		for(int i = 0; i < arr.length; i++){
			
			if(arr[i] != 0){
				currentSize = currentSize +1;
			}
			else{
				currentSize = 0;
			}
			
			if(currentSize > maxSizeSoFar){
				maxSizeSoFar = currentSize;
			}
		}
		
		return zeroCount + maxSizeSoFar;
		
	}

}
