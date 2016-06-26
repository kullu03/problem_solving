package com.careercup.arrays.string;

import java.util.ArrayList;
import java.util.List;

public class Matrix {

	public static void main(String[] args) {
		
		int [][] matrix = new int[][]{{1,0,1,1},{2,2,2,2},{3,3,3,3}};
		List<Pair>zero = new ArrayList<Pair>();
		for(int i =0; i < matrix.length;i++){
			for(int j=0;j<matrix.length+1;j++){
				if(matrix[i][j] ==0){
					Pair p = new Matrix().new Pair(i,j);
					zero.add(p);
				}
			}
		}
		
		for(Pair p : zero){
			int row = p.row;
			int col = p.col;
			for(int i =0; i<4; i++){
				matrix[row][i]=0;
			}
			
			for(int i =0; i <3;i++){
				matrix[i][col] = 0;
			}
			
		}
		
		for(int i = 0; i < 3;i++){
			for(int j=0;j<4;j++){
				System.out.println(matrix[i][j]);
			}
		}

	}
	
	class Pair{
		int row;
		int col;
		public Pair(int row,int col){
			this.row = row;
			this.col = col;
		}
	}

}
