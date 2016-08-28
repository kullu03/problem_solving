package com.practice.algorithm.sorting;

public class MergeSort {


	
	// This method merges two sorted input array left 
	// and right into a single sorted array containing both arrays element
	public int [] merge(int [] arrLeft,int [] arrRight){
		
		// if both are null 
		if(arrLeft == null && arrRight == null){
			return null; 
		}
		
		// if both are not null but are empty then return empty final merged array
		if((arrLeft != null && arrLeft.length == 0) && (arrRight != null && arrRight.length ==0)){
			return new int[0]; 
		}
		
		// if one is null or empty but other one has some element.. return non empty array
		
		if(((arrLeft == null) || (arrLeft != null && arrLeft.length == 0)) && ((arrRight != null) && arrRight.length == 0))
			return arrRight;
		

		if(((arrRight == null) || (arrRight != null && arrRight.length == 0)) && ((arrLeft != null) && arrLeft.length == 0))
			return arrLeft;
		
		
		int leftHead = 0;
		int rightHead = 0;
		int finalHead = 0;
		int finalArraySize = arrLeft.length + arrRight.length;
		int [] finalArray = new int[finalArraySize];
		
		while(finalHead < finalArraySize){
			
			// if Left array has smaller number at left head then put that element in the final array
			if(leftHead < arrLeft.length && rightHead < arrRight.length && arrLeft[leftHead] <= arrRight[rightHead]){
				finalArray[finalHead] = arrLeft[leftHead];
				leftHead = leftHead + 1;
				finalHead = finalHead + 1;
			}
			
			// Right array has smaller element at the head
			if(leftHead < arrLeft.length && rightHead < arrRight.length && arrLeft[leftHead] > arrRight[rightHead]){
				finalArray [finalHead] = arrRight[rightHead];
				rightHead = rightHead + 1;
				finalHead = finalHead + 1;
			}
			
			// if left array has remaining element add that into the last of final array
			if(rightHead >= arrRight.length){
				
				while(leftHead < arrLeft.length){
					finalArray[finalHead] = arrLeft[leftHead];
					finalHead = finalHead + 1;
					leftHead = leftHead + 1;
				}
				
			}
			
			// if right array has element remaining add that into final array
			
			if (leftHead >= arrLeft.length) {

				while (rightHead < arrRight.length) {
					finalArray[finalHead] = arrRight[rightHead];
					finalHead = finalHead + 1;
					rightHead = rightHead + 1;
				}

			}
			
		}
		
		return finalArray;
	}

}
