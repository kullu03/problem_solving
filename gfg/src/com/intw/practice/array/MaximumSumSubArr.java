package com.intw.practice.array;

public class MaximumSumSubArr {

	public static void main(String[] args) {
		int[] arr = { -2, -3, -4, 0, -2, -1, -5, -3 };
		System.out.println(getMaxSum(arr));
		System.out.println(getMaxSumKadane(arr));
	}

	private static int getMaxSum(int[] arr) {

		int sum = arr[0];
		int currSum = arr[0];
		int s = 0;
		int e = 0;
		for (int i = 0; i < arr.length - 1; i++) {

			currSum = arr[i];
			for (int j = i + 1; j < arr.length; j++) {

				if (currSum > sum) {
					s = i;
					e = j - 1;
					sum = currSum;
				}
				currSum = currSum + arr[j];
			}
		}

		System.out.println(" i = " + s + " " + "j = " + e);
		return sum;
	}

	private static int getMaxSumKadane(int[] arr) {
		int currMax = arr[0];
		int maxSoFar = arr[0];

		for (int i = 1; i < arr.length; i++) {

			currMax = max(arr[i], currMax + arr[i]);
			maxSoFar = max(currMax, maxSoFar);
		}

		return maxSoFar;

	}

	private static int max(int a, int b) {
		return a >= b ? a : b;
	}

}
