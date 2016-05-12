package com.practice.algorithm.search;



public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {-90,5,7,9,11,13,14,45,67,89};
		if(doBinarySeach(arr,-90)){
		System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
	}

	private static boolean doBinarySeach(int[] arr, int i) {
		if(arr == null || arr.length ==0)
			return false;
		
		int mid = arr.length/2;
		int low = 0;
		int high = arr.length-1;
		
		//iterative
		while(low <= high){
			mid = (high+low)/2;
			if(arr[mid] == i){
				return true;
			}
			
			else if(i < arr[mid]){
				high = mid-1;
			}
			
			else if(i > arr[mid]){
				low = mid+1;
			}
			
		}
		
		return false;
	}

}
