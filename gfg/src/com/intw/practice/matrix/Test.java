package com.intw.practice.matrix;

public class Test {

	public static void main(String[] args) {

		int [] [] matrix = {{1,2,3,4},
							{5,6,7,8},
							{9,10,11,12}
							};
/*		
		System.out.println(matrix.length);
		printArr(matrix[0]);
		printArr(matrix[1]);
		printArr(matrix[2]);*/
		
		for( int row = 0; row < matrix.length; row++){
			for(int col = 0; col < matrix[0].length; col ++){
				System.out.print(matrix[row][col] + " ");
			}
			System.out.println("");
		}

	}

	private static void printArr(int[] arr) {
			for(int i =0 ; i < arr.length; i++){
				System.out.print(arr[i] + " ");
			}
			System.out.println("");
	}

}
