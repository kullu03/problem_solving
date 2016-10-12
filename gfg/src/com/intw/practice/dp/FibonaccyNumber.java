package com.intw.practice.dp;

public class FibonaccyNumber {

	public static void main(String[] args) {

		System.out.println(getNthFibonaccyNumNaive(6));
		System.out.println(getNthFibonaccyNumMemoization(6));
		System.out.println(getNthFibonaccyNumBottomUp(6));
		
	}

	private static int getNthFibonaccyNumBottomUp(int num) {
		int [] lookup = new int[num + 1];
		
		for(int i = 1; i <= num; i ++){
			if(i <= 2){
				lookup[i] = 1;
				
			}else{
				lookup[i] = lookup[i-1] + lookup[i-2];
			}
			
		}

		return lookup[num];
	}

	private static int getNthFibonaccyNumMemoization(int num) {
		
		int [] memo = new int[num + 1];
		if(num <=2){  
			memo[num] = 1;
		}
		if(memo[num] == 0){
			memo[num] = getNthFibonaccyNumMemoization(num-1) + getNthFibonaccyNumMemoization(num-2);
		}
		return memo[num];
		
	}

	private static int getNthFibonaccyNumNaive(int num) {
		if( num <= 2)return 1;
		return getNthFibonaccyNumNaive(num-1) + getNthFibonaccyNumNaive(num-2);
	}

}
