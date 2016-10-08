package com.intw.practice.backtracking;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class SubSetSum {

	public static void main(String[] args) {
		
		Set<Integer>inputSet = new HashSet<Integer>(Arrays.asList(15, 22, 14, 26, 32, 9, 16, 8,23,
				12,34,56,78,90,13,14,16,17,18,19,2,9,23,25,26,27,28,29,30,31,32));
		Set<Integer> output = getSubsetOfSum(inputSet,103);
		for(Integer in : output){
			System.out.print(in + " ");
		}

	}
	
	// this method will return empty set if given input set does not have
	/**
	 * This method uses backtracking technique to get the output set having sum of all 
	 * element equal to K.
	 * 
	 * @param inputSet
	 * @param k
	 * @return output set having sum of all element as k. If there is no subset then it 
	 * returns empty set if there are no set having sum as K
	 * @throws IllegalArgumentException if empty set or null set is passed in parameter
	 * 
	 */
	public static Set<Integer> getSubsetOfSum(Set<Integer>inputSet,int k){
		if(inputSet == null || inputSet.isEmpty())
			throw new IllegalArgumentException("provided input set null or empty. Input "
					+ "set must ne non empty");
		
		Set<Integer>outputSet = new HashSet<Integer>();
		int sum = 0;
		for(Integer in : inputSet){
			sum = sum + in;
		}
		if(k > sum){
			return outputSet; 
		}

		Stack<Integer>ss = new Stack<>();
		ss.addAll(inputSet);
		
		
		while( !ss.isEmpty()){			
			Integer popedElement = ss.pop();
			outputSet = new HashSet<>();
			outputSet.add(popedElement);
			sum = popedElement;
			
			for(Integer in : inputSet){
				
				if(sum == k) return outputSet;
				
				if(in != popedElement && (sum + in) <= k ){
					outputSet.add(in);
					sum = sum + in;
				}
				
			}
			
			
		}
		
		return new HashSet<>();
		
	}

}
