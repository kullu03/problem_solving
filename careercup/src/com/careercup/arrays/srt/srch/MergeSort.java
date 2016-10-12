package com.careercup.arrays.srt.srch;

public class MergeSort {

	public static void main(String[] args) {
		
		int [] arr = new int [] {19,34,43,56,78,89,90,91,0,0,0,0};
		int [] brr = new int [] {92,93,94,95,98};
		
		merge(arr,brr,7);
		System.out.println(arr);
	}

	/**
	 * 
	 * @param arr first array having capacity to contain all elements of arr and brr.
	 * @param brr is the second arr that need to be merged in first array {@code arr}
	 * @param m is the length on which first array is full
	 */
	private static void merge(int[] arr, int[] brr,int m) {

		int k = arr.length - 1;
		int n = brr.length - 1;
		
		while(n >=0){
			
			if(brr[n] >= arr[m]){
				arr[k--] = brr[n--];
			}else{
				arr[k--] = arr[m--];
			}			
		}
		
		
	}

}
