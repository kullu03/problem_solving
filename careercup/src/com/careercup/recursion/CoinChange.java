package com.careercup.recursion;

public class CoinChange {

	public static void main(String[] args) {
		int coins[] = { 1, 5, 10, 15 };
		System.out.println(getNumberOfWays(coins, 8000, coins.length - 1));

	}

	private static int getNumberOfWays(int[] coins, int sum, int numberOfCoins) {

		if (sum < 0)
			return 0;

		if (sum == 0)
			return 1;

		if (numberOfCoins <= 0 && sum >= 1)
			return 0;

		return getNumberOfWays(coins, sum, numberOfCoins - 1)
				+ getNumberOfWays(coins, sum - coins[numberOfCoins - 1], numberOfCoins);

	}

}
