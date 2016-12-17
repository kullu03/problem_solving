package com.intw.practice.matrix;
/*
 *  Given a cost matrix cost[][] and a position (m, n) in cost[][], 
 *  write a function that returns cost of minimum cost path to reach (m, n) from (0, 0).
 *  Each cell of the matrix represents a cost to traverse through that cell. 
 *  Total cost of a path to reach (m, n) is sum of all the costs on that path (including both source and destination). 
 *  You can only traverse down, right and diagonally lower cells from a given cell, i.e., from a given cell (i, j), 
 *  cells (i+1, j), (i, j+1) and (i+1, j+1) can be traversed. 
 *  You may assume that all costs are positive integers.
 */
public class MinCostPath {

	public static void main(String[] args) {
		int mat[][]  =  { {10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50},
              };

		System.out.println(getMinCost(mat,1,1));
	}
	
	static int getMinCost(int[][] cost, int row, int col) {
		if (row < 0 || col < 0) {
			return Integer.MAX_VALUE;
		}
		if (row == 0 && col == 0) {
			return cost[row][col];
		}

		return cost[row][col] + min(getMinCost(cost, row - 1, col - 1), getMinCost(cost, row, col - 1),
				getMinCost(cost, row - 1, col));

	}

	private static int min(int x, int y, int z) {
		
		if (x < y)
		      return (x < z)? x : z;
		   else
		      return (y < z)? y : z;
		
		
	}

}
