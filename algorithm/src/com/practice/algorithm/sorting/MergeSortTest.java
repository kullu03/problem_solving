package com.practice.algorithm.sorting;

public class MergeSortTest {

	public static void main(String[] args) {
		MergeSort ms = new MergeSort();
		/*System.out.println(ms.merge(null, null));
		System.out.println(ms.merge(null, new int[0]));*/
		int []left = {3,8,9,11,900,1000,1001,1002,1003,1004,1008};
		int right [] = {1,2,4,5,70,90,100,120};
		int [] fa = ms.merge(left, right);
		printArray(fa);
		System.out.println(fa.length);
	
		
	}

	private static void printArray(int[] fa) {
		for (int i = 0; i < fa.length; i++) {
			System.out.print(fa[i] + " ");
		}
		System.out.println(" ");
	}

}
