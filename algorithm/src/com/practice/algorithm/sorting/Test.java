package com.practice.algorithm.sorting;

public class Test {

	public static void main(String[] args) {

		int arr [] = {5,4,9,11,12,1,3,8};
		System.out.println("Before sort ..");
		printArray(arr);
		InsertionSortUtil.sort(arr);
		System.out.println("After sort ..");
		printArray(arr);
	}

	static void printArray(int [] arr){
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
	}
}
