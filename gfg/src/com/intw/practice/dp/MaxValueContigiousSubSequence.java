package com.intw.practice.dp;
/**
 * 
 * @author Kuldeep Singh
 *
 *Detail can be found here
 * https://people.cs.clemson.edu/~bcdean/dp_practice/dp_1.swf
 * 
 * Here idea is that get the max sum of all array at ending each position and finally take the 
 * max of all position.
 *
 */
public class MaxValueContigiousSubSequence {

	public static void main(String[] args) {
		int [] arr = {-2,-3,4,-1,-2,1,5,-3};
	System.out.println(getMaxValue(arr));

	}

	private static int getMaxValue(int[] arr) {
		if(arr == null || arr.length == 0){
			throw new IllegalArgumentException();
		}
		
		int currMax = arr[0];
		int maxtillNow = arr[0];
		int maxEndingIndex = 0;
		for (int i = 1; i < arr.length; i++) {
			currMax = (arr[i] + currMax) >= arr[i] ? (arr[i] + currMax) : arr[i];
			if(currMax > maxtillNow){
				maxtillNow = currMax;
				maxEndingIndex = i;
			}
			//maxtillNow = maxtillNow >= currMax ? maxtillNow : currMax;
		}
		System.out.println("end : " + maxEndingIndex);
		int sum = 0;
		int startIndex = -1;
		for(int i = maxEndingIndex ; i >=0; i--){
			sum = sum + arr[i];
			if(sum == maxtillNow){
				startIndex = i;
				break;
			}
			
		}
		System.out.println("Start " + startIndex);
		return maxtillNow;
		
		
	}

}
