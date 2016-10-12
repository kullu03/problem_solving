package com.careercup.arrays.srt.srch;

public class ElementInSortedMatrix {

	public static void main(String[] args) {
		int [][] matrix = 
		new int[][]{
			  { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 },
			  { 11, 12, 13, 14, 15, 16, 17, 18, 19, 20},
			  { 21, 22, 23, 24, 25, 26, 27, 28, 29, 30 },
			  { 31, 32, 33, 34, 35, 36, 37, 38, 39, 40 },
			  { 41, 42, 43, 44, 45, 46, 48, 50, 52, 54}
			};
			
		System.out.println(findElement(matrix,1));
		System.out.println(findElement(matrix,11));
		System.out.println(findElement(matrix,18));
		System.out.println(findElement(matrix,36));
		System.out.println(findElementFromSortedMatrix(matrix,31));
		System.out.println(findElementFromSortedMatrix(matrix,51));
		System.out.println(findElementFromSortedMatrix(matrix,44));
		System.out.println(findElementFromSortedMatrix(matrix,58));
		
		
	}

	private static boolean findElementFromSortedMatrix(int[][] matrix, int num) {
	
		// apply binary search  
		// 1. First apply on column 
		// 2. Then apply BS on selected Row for that particular column.
		
		int colStart = 0;
		int colEnd = matrix.length -1;
		int colMid = (colStart + colEnd)/2;
		
		// if last element is less than num it means number is not present in matrix.
		
		if(num > matrix[matrix.length -1][matrix[0].length - 1] )return false;
		
		// get the column
		while (colStart <= colEnd) {

			colMid = (colStart + colEnd) / 2;

			if (num > matrix[colMid][matrix[0].length - 1]) {
				colStart = colMid + 1;
			} else {
				colEnd = colMid - 1;
			}
		}
		
		// now search in the Row.
		
		int rowStart = 0;
		int rowEnd =  matrix[0].length - 1;
		int rowMid = (rowEnd + rowStart)/2;
		
		while(rowStart <= rowEnd){
			 rowMid = (rowEnd + rowStart)/2;
			 if(num == matrix[colMid][rowMid]) return true;
			 else if(num > matrix[colMid][rowMid]){
				 rowStart = rowMid +1;
			 }else{
				 rowEnd = rowMid -1;
			 }
		}
		
		return false;
	}
	/**
	 * this solution is from careercup book. This solution 
	 * 
	 * @param matrix
	 * @param num
	 * @return
	 */
	private static boolean findElement(int[][] matrix, int num){
		int row = matrix.length -1;
		int col = matrix[0].length -1;
		
		int colIndex = 0;
		int rowIndex = 0;
		while(rowIndex >= 0 && colIndex >= 0){
			if(matrix[colIndex][rowIndex] == num) return true;
			else if( num > matrix[colIndex][row]){
				rowIndex = rowIndex +1;
			}
			else{
				colIndex = colIndex - 1;
			}
		}
		return false;
	}

}
