package com.intw.practice.divideandconquer;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class FrequencyOfElement {

	public static void main(String[] args) {
	
		int arr [] = {0,0,0,1, 1, 1, 2,2,2, 3, 3, 5,5, 8, 8, 8, 9, 9,10,10,10,11,12,13,13,13,14,14};
		Map<Integer,Integer>elementToFrequencyCountMap = getFrequency(arr,3);
		System.out.println(elementToFrequencyCountMap);
		

	}

	private static Map<Integer, Integer> getFrequency(int[] arr, int max) {
		Map<Integer,Integer>map = new HashMap<>();
		FrequencyOfElement fc = new FrequencyOfElement();
		Stack<Pair<Integer,Integer>> stack = new Stack<>();
		stack.push(fc.new Pair<Integer, Integer>(0, arr.length -1));
		
		while (!stack.isEmpty()) {
			int currentMax = max;
			Pair<Integer, Integer> p = stack.pop();
			if(p.e != p.s){
				int midIndex = (p.e + p.s) / 2;
				currentMax = currentMax - 1;
				map.put(arr[midIndex], 1);
				int i = 1;
				while (currentMax > 0 && midIndex+1 < arr.length -1) {
					if (arr[midIndex] != arr[midIndex + i])
						break;
					else {
						map.put(arr[midIndex], map.get(arr[midIndex]) + 1);
						i = i + 1;
						currentMax = currentMax - 1;
					}
				}

				int r = map.get(arr[midIndex]);
				int rightStartIndex = midIndex + r;
				int rightEndIndex = p.e;
				if (rightStartIndex < p.e) {
					stack.push(fc.new Pair<Integer, Integer>(rightStartIndex, rightEndIndex));
				}

				// if all element does not repeat in right
				int j = 1;
				while (currentMax > 0 && midIndex-j >= 0) {
					if (arr[midIndex] != arr[midIndex - j])
						break;
					else {
						map.put(arr[midIndex], map.get(arr[midIndex]) + 1);
						currentMax = currentMax - 1;
						j = j + 1;
					}
				}

				int leftStartIndex = p.s; //TODO: need to fix. I do not know how its working. In my point of view it should not work	
				// but looks like I am very fortunate.
				int leftEndIndex = midIndex - j;
				if (leftEndIndex > 0) {
					stack.push(fc.new Pair<Integer, Integer>(leftStartIndex, leftEndIndex));
				}

			}
		}
		return map;

	}
	
	class Pair<S,E>{
		S s;
		E e;
		
		public Pair(S s,E e){
			this.s = s;
			this.e = e;
		}
		
	}

}
