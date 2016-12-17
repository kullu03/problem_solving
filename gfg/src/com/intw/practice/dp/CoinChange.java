package com.intw.practice.dp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CoinChange {
	/**
	 * Two things to apply dynamic programming approach 1. Recomputioan of same
	 * set of problem is happening then try to store the computation and before
	 * calculating the new one do the look up. 2. Optimal substructure --
	 * 
	 * {1,2,3} N = 4; 1,1,1,1 2,2 1,1,2 1,3, 2,2
	 *
	 */

	public static void main(String[] args) {
		int[] demo = { 1, 2, 3,7,8,9,11};
		List<String> changes = new ArrayList<String>();
		getNumberOfWaysTochange(demo, 123, 0, "", changes);
		Collections.sort(changes, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.length() - o2.length();
			}
		});
		;
		System.out.println(changes.get(0).length());
		System.out.println(changes.size());

	}

	private static void getNumberOfWaysTochange(int[] coins, int totalSum, int coinIndex, String currentChange,
			List<String> changes) {

		if (totalSum < 0) {
			return ;
		}
		if (totalSum == 0) {
			changes.add(currentChange);
			return ;
		}

		if (coinIndex < 0 || coinIndex >= coins.length) {
			return ;
		}

		/*int changeWithoutCurrentCoin =*/ getNumberOfWaysTochange(coins, totalSum, coinIndex + 1, currentChange, changes);
		/*int changeWithCurrentCoin =*/ getNumberOfWaysTochange(coins, totalSum - coins[coinIndex], coinIndex,
				currentChange + "" + coins[coinIndex], changes);

		//return changeWithoutCurrentCoin + changeWithCurrentCoin;

	}
	
	public static void getNumOfWaysUsingDP(int [] coins,int sum){
		
		int [] out = new int [sum+1];
		
		out[0] = 0;
		
	}

}
