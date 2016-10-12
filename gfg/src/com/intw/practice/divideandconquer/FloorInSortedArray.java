package com.intw.practice.divideandconquer;
/**
 * 
 * @author Kuldeep Singh
 *
 */
public class FloorInSortedArray {
	
	public static void main(String [] args){
		int [] arr = {1, 2, 8, 10, 10, 12, 19};
		int [] arr1= {1, 2, 4, 6, 10, 12, 14};
		System.out.println(getFloorInArray2(arr,5));
		System.out.println(getFloorInArray2(arr,20));
		System.out.println(getFloorInArray2(arr,0));
		System.out.println(getFloorInArray2(arr1,7));
	}

	private static int getFloorInArray2(int[] arr, int num) {
		int floor = -1;

		if(arr == null || arr.length == 0 || num < arr[0]){
			return -1;
		}

		if( num >= arr[arr.length -1])
			return arr[arr.length -1];
		
		int startIndex = 0;
		int endIndex = arr.length -1;
		
		while( startIndex <= endIndex){
			int midIndex = (startIndex + endIndex)/2;
			if(arr[midIndex] > num){
				endIndex = midIndex -1;
			}
			
			else if(arr[midIndex] < num  && arr[midIndex +1] > num){
				return arr[midIndex];
			}
			else{
				startIndex = midIndex + 1;
			}	
		}
		return floor;
	}
	
	private static int getFloorInArray(int[] arr, int num) {
		// some base condition.
		int floor = -1;
		
		if(arr == null || arr.length == 0 || num < arr[0]){
			return -1;
		}
		
		if( num >= arr[arr.length -1])
			return arr[arr.length -1];
				
		for(int currentIndex = 1; currentIndex < arr.length ; currentIndex++){
			
			if(num <= arr[currentIndex-1] &&  arr[currentIndex] > num){
				return currentIndex-1;
			}
			
		}
		
		return floor;
		
		
	}
	
	

}
