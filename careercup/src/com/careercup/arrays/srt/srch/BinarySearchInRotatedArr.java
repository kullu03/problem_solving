package com.careercup.arrays.srt.srch;

public class BinarySearchInRotatedArr {

	public static void main(String[] args) {
		
		int [] arr = new int [] {15,16,19,20,25,1,3,4,5,7,10,14};
		
		/**
		 * 
		 * 
		 * {15, 16, 19, 20, 25, 1, 3, 4, 5, 7, 10, 14}; 
		 * {1, 3, 4, 5, 7, 10,14,15, 16, 19, 20, 25}; 
		 * { 19, 20, 25, 1, 3, 4, 5, 7, 10, 14,15,16}; 
		 * {25,20,19,16,15,14,10,7,5,4,3,1};
		 * 
		 * 
		 */
		
		int [] arr1 = new int [] {19, 20, 25, 1, 3, 4, 5, 7, 10, 14,15,16};
		int [] arr2 = new int [] {2,2,2,2,2,2,2,2,2,3,2,2,2,2,2,2,2,2,2};
		int [] arr3 = new int [] {2,2,2,2,2,2,2,2,2,3,3,4,4,5,5,6,7};
		System.out.println(getNumberIndex(arr,5));
		System.out.println(getNumberIndex(arr,15));
		System.out.println(getNumberIndex(arr,14));
		System.out.println("===================================");
		System.out.println(getNumberIndex(arr1,5));
		System.out.println(getNumberIndex(arr1,15));
		System.out.println(getNumberIndex(arr1,14));
		System.out.println(getNumberIndex(arr2,3));
		System.out.println("================================");
		System.out.println(getNumberIndex(arr3,2));
		System.out.println(getNumberIndex(arr3,4));
		System.out.println(getNumberIndex(arr3,6));
	}
	
/**
 * 
 * @param arr
 * @param num
 * @return if {@code num } not found in {@code arr } then returns -1 other wise returns the index of {@code num } 
 * in {@code arr}
 * 
 */
	private static int getNumberIndex(int[] arr, int num) {
		
		int start = 0;
		int end = arr.length - 1;
		int mid = (start + end) / 2;
		boolean isArrRotated = true;
		while (start <= end) {
			mid = (start + end) / 2;
			if ((arr[mid - 1] > arr[mid]) && (arr[mid + 1] > arr[mid])) {
				break;
			}
			// divide the array
			// if first element is > than mid element it means array rotation
			// point is in left.
			if (arr[0] > arr[mid]) {
				end = mid - 1;
				// array rotation point is in right
			} else if (arr[end] < arr[mid]) {
				start = mid + 1;
			} else {
				// array is not rotated at all.
				isArrRotated = false;
				break;
			}
		}
		
		// if rotation point is the search element then return that element
		if(num == arr[mid])return mid;
		
		if(isArrRotated){
			// if num is in left of rotation point then
			if (num >= arr[0] && num <= arr[mid -1]){
				start = 0;
				end = mid -1;
			}else{
				start = mid +1;
				end = arr.length -1;
			}
		}else{
			start = 0;
			end = arr.length -1;
		}

		// once we have lower and upper bound. Apply BS.
		while(start <= end){
			mid = (start + end)/2;
			if(arr[mid] == num)return mid;
			else if(num > arr[mid]){
				start = mid +1;
			}else{
				end = mid -1;
			}
		}

		
		return -1;
	}

}
