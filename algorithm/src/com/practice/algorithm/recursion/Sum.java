package com.practice.algorithm.recursion;

public class Sum {

	public static void main(String[] args) {
		int n = 10;
		System.out.println(recursiveSum(n));

	}

	private static int recursiveSum(int n) {
		if(n == 0) return 0;

		return  n+recursiveSum(n-1);

	}

}
