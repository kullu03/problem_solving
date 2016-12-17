package com.practice.algorithm.heap;

public class TestHeap {

	public static void main(String[] args) {
		String [] str = {"Kuldeep","Singh","Saini","Sultanpur"};
		Heap<String> h = new Heap<String>(str);
		String[] kk = h.buildMaxHeap();
		for(String st : kk){
			System.out.print(st + " ");
		}
		
		Integer [] arr = {5,11,2,9,7,6,4,12,18};
		Heap<Integer> hh = new Heap<Integer>(arr);
		Integer ll = hh.getNthMax(5);
		System.out.println(ll.toString());
		System.out.println(ll);
	}

}
