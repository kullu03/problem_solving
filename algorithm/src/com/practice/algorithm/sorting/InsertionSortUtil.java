package com.practice.algorithm.sorting;

public class InsertionSortUtil {
	
	public static void sort(int [] arr){
		// if array is null or array have only one element in the array
		// do not do anything
		if(arr == null || arr.length <= 1) return;
		
		// if array have two or more than 2 elements in the array
		
		int unsortedAreaIndex = 0;
		int sortedAreaIndex =  0;
		
		for (unsortedAreaIndex = 1; unsortedAreaIndex < arr.length; unsortedAreaIndex++) {
			sortedAreaIndex = unsortedAreaIndex - 1;
			int key = arr[unsortedAreaIndex];

			while (sortedAreaIndex > -1 && arr[sortedAreaIndex] > key ) {
				arr[sortedAreaIndex + 1] = arr[sortedAreaIndex];
				sortedAreaIndex = sortedAreaIndex - 1;

			}

			arr[sortedAreaIndex + 1] = key;

		}	
	}

}
