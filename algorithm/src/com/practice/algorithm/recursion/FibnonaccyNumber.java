package com.practice.algorithm.recursion;

public class FibnonaccyNumber {

	public static void main(String[] args) {
		System.out.println(getNthFib1(1));
		System.out.println(getNthFib1(2));
		System.out.println(getNthFib1(3));
		System.out.println(getNthFib1(4));
		System.out.println(getNthFib1(5));
		System.out.println(getNthFib1(6));
		System.out.println(getNthFib1(7));

	}

	public static int getNthFib(int n){
		if( n == 0 || n == 1) return n;
		return getNthFib(n-1) + getNthFib(n-2);
	}

	public static int getNthFib1(int n){
		if( n < 0) return -1;
		
		if(n == 0) return 0;

		if(n == 1 || n == 2){
			return 1;
		}
		int a = 1; int b = 1;
		for (int i = 3; i <= n; i++) {
			int c = a + b;
			a = b;
			b = c;
		}
		return b;

	}
}
