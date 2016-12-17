package com.intw.practice.array;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class SortedStack {

	public static void main(String[] args) {
	
	Stack<Integer> s = new Stack<Integer>();
	s.push(-3);
	s.push(14);
	s.push(18);
	s.push(-5);
	s.push(30);
	System.out.println(s.toString());
	Stack<Integer>  sorted = new Stack<>();
	sortStack1(s,sorted);
	System.out.println(sorted.toString());
		
	}

	private static Stack<Integer> sortStack(Stack<Integer> s) {
		
		
		Stack<Integer> sorted = new Stack<Integer>();
		
		
		
		while(!s.isEmpty()){
			
			Integer temp = s.pop();
			
			if(sorted.isEmpty() || temp >= sorted.peek()){
				sorted.push(temp);
			}else{
				while(!sorted.isEmpty()){
					s.push(sorted.pop());
				}
				sorted.push(temp);
			}
			
		}
		return sorted;
		
		
	}
	
	
private static void sortStack1(Stack<Integer> s,Stack<Integer> sorted ) {
		
		if(s.isEmpty()) return;
	
			
			Integer temp = s.pop();
			
			if(sorted.isEmpty() || temp <= sorted.peek()){
				sorted.push(temp);
			}else{
				while(!sorted.isEmpty()){
					s.push(sorted.pop());
				}
				sorted.push(temp);
			}
			
			sortStack1(s,sorted);
		
		
		
	}
	

}
