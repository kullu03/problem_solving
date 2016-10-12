package com.intw.practice.divideandconquer;

public class CubicRootCalculator {

	public static void main(String[] args) {

		System.out.println(getCubicRootForNumber2(729));
		System.out.println(getCubicRootForNumber2(800));
		System.out.println(getCubicRootForNumber3(800));
		System.out.println(getCubicRootForNumber3(900));


	}
	
	private static double getCubicRootForNumber3(double num) {
		double errorPrec = 0.000001;
		double start = 0;
		double end  = num;

		while(true){			
			double mid  = (start + end)/2;			
			double error = Math.abs((num-(mid*mid)));
			if(error <= errorPrec) return mid;
			else if((mid*mid) > num){
				end = mid;
			}else{
				start = mid;
			}			
		}
	}
	
	private static double getCubicRootForNumber2(double num) {
		double errorPrec = 0.0000001;
		double start = 0;
		double end  = num;

		while(true){			
			double mid  = (start + end)/2;			
			double error = Math.abs((num-(mid*mid*mid)));
			if(error <= errorPrec) return mid;
			else if((mid*mid*mid) > num){
				end = mid;
			}else{
				start = mid;
			}			
		}
	}

	private static int getCubicRootForNumber(int num) {

		int [] arr = new int[num/3+1];

		for(int i = 0; i <= num/3; i++){
			arr[i] = i;			
		}

		// now we get sorted array
		// binary search 
		// if arr[mid] * arr[mid] * arr[mid]  == num 
		// return arr[mid];
		// as usual lower the bound

		int startIndex = 0;
		int endIndex = arr.length-1;

		while(startIndex <= endIndex){

			int midIndex = (startIndex + endIndex)/2;
			if(arr[midIndex] * arr[midIndex] * arr[midIndex] == num )return arr[midIndex];
			else if(arr[midIndex] * arr[midIndex] * arr[midIndex] > num){
				endIndex = midIndex -1;
			}else{
				startIndex = midIndex +1;
			}


		}

		return -1;

	}

}
