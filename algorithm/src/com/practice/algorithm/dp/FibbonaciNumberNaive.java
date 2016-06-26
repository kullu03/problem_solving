package com.practice.algorithm.dp;

import java.util.HashMap;
import java.util.Map;

public class FibbonaciNumberNaive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//getNthFibNumber(50);
		System.out.println(getNthFibNumberRec(8));

	}

	public static void getNthFibNumber(int n){
		int fib [] = new int[n+1];
		for(int i =1; i <=n; i++){
			if(i ==1 || i ==2)
				fib[i]=1;
			else{
				fib[i] = fib[i-1] + fib[i-2];
			}
		}
		
		for(int j =1; j<=n; j++){
			System.out.println(fib[j]);
		}
	}

	public static int getNthFibNumberRec(int n){
		if(n ==1 || n==2){
			return 1;
		}
		return getNthFibNumberRec(n-1) + getNthFibNumberRec(n-2);
	}
	

}
