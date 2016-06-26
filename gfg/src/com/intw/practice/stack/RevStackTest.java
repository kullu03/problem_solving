package com.intw.practice.stack;

import java.util.Stack;

/**
 * @author Kuldeep Singh
 * 
 * 
 * This is in-place reverse stack method.
 *
 */
public class RevStackTest {

	public static void main(String[] args) {
		
		Stack<Integer> s = new Stack<Integer>();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		for(Integer  in : s){
			System.out.println(in + " ");
		}
		reverseStack(s);
		while(!s.isEmpty()){
			System.out.println(s.pop() + " ");
		}

	}

	private static void reverseStack(Stack<Integer> s) {
		if(s.isEmpty()) return;
		
		int p = s.pop();
		reverseStack(s);
		s.push(p);
		
		
	}

}
