package com.practice.algorithm.sorting;

public class MergeSortTest {

	public static void main(String[] args) {
		MergeSort ms = new MergeSort();
		/*System.out.println(ms.merge(null, null));
		System.out.println(ms.merge(null, new int[0]));*/
		int []left = {3,8,9,11,87,1,90,900,1000,1001,1002,10003,1004,1008};
		//int right [] = {1,2,4,5,70,90,100,120};
		//int [] fa = ms.merge(left, right);
		System.out.println(printArray(left));
		ms.sort(left,0,left.length-1);
		System.out.println(printArray(left));
	
		
	}

	private static String printArray(int[] arr) {
		if (arr == null)
			return "null";

		int length = arr.length - 1;

		if (length == -1)
			return "[]";

		StringBuilder output = new StringBuilder();
		output.append("[");

		for (int i = 0; i <= length; i++) {
			output.append(arr[i]);
			if (i == length) {
				output.append("]");
			} else {
				output.append(",");
			}
		}

		return output.toString();
	}

}
