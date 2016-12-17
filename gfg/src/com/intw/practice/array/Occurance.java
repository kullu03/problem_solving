package com.intw.practice.array;

public class Occurance {

	public static void main(String[] args) {

		int[] arr = { 1, 1, 2, 2, 2, 2, 3 };
		System.out.println(getOccuranceCount(arr, 3));
		System.out.println(getOccuranceCount(arr, 2));
		System.out.println(getOccuranceCount(arr, 3));
		System.out.println(getOccuranceCount(arr, 4));

	}

	private static int getOccuranceCount(int[] arr, int x) {
		if (arr == null || arr.length == 0) {
			return 0;
		}

		int startIndex = getStartIndex(arr, x);
		if (startIndex < 0) {
			return -1;
		}
		int endIndex = getLastIndex(arr, x);

		return (endIndex - startIndex) + 1;

	}

	private static int getStartIndex(int[] arr, int x) {
		int startIndex = 0;
		int endIndex = arr.length - 1;

		while (startIndex <= endIndex) {
			int midIndex = (startIndex + endIndex) / 2;
			if ((arr[midIndex] == x) && ((midIndex == 0) || (midIndex != 0 && arr[midIndex - 1] < x))) {
				return midIndex;
			}

			else if (x <= arr[midIndex]) {
				endIndex = midIndex - 1;
			} else {
				startIndex = midIndex + 1;
			}

		}
		return -1;
	}

	private static int getLastIndex(int[] arr, int x) {
		int startIndex = 0;
		int endIndex = arr.length - 1;

		while (startIndex <= endIndex) {
			int midIndex = (startIndex + endIndex) / 2;
			if ((arr[midIndex] == x)
					&& ((midIndex == arr.length - 1) || (midIndex != arr.length - 1 && arr[midIndex + 1] > x))) {
				return midIndex;
			}

			else if (x < arr[midIndex]) {
				endIndex = midIndex - 1;
			} else {
				startIndex = midIndex + 1;
			}

		}
		return -1;
	}

}
