package com.intw.practice.heap;

import java.util.Arrays;

/**
 * 
 * @author Kuldeep Singh
 *
 */
public class KLargestElementLocator {

	public static void main(String[] args) {
		int [] arr = {1, 23, 12, 9, 30, 2, 50};
		System.out.println(printArray(arr));
		System.out.println(printArray(getKLargestElement(arr, 1)));
	}


	// First approach is the bubble k times and get the last K elements from 
	// array

	public static int [] getKLargestElement(int [] arr,int k){
		int length = arr.length -1;
		for(int j = 0; j < k; j++){

			for(int i = 1; i <= length; i++){
				if(arr[i-1] > arr[i]){
					int t = arr[i];
					arr[i] =  arr[i-1];
					arr[i-1] = t;

				}

			}
			length = length -1;
		}
		return Arrays.copyOfRange(arr, arr.length-k, arr.length);

	}

	public static String printArray(int [] arr){
		StringBuilder output = new StringBuilder();
		output.append("[");
		for(int i = 0; i < arr.length; i++){
			output.append(arr[i]);
			if(i == arr.length -1){
				output.append("]");
			}
			else{
				output.append(",");
			}
		}
		return output.toString();
	}

	public static String printArray3(int [] arr){
		StringBuilder output = new StringBuilder();
		output.append("[");
		for(int i = 0; i < arr.length; i++){
			output.append(arr[i]);
			if(i == arr.length -1){
				output.append("]");
			}
			else{
				output.append(",");
			}
		}
		return output.toString();
	}
	
}
