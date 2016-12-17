package com.intw.practice.backtracking;

import java.util.Stack;

public class ReverseStackRec {

	public static void main(String[] args) {

		Stack<Integer> s = new Stack<Integer>();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		reverse(s);

		while (!s.isEmpty()) {
			System.out.print(s.pop() + " ");
		}
	}

	private static void reverse(Stack<Integer> s) {

		if (!s.isEmpty()) {
			Integer temp = s.pop();
			reverse(s);
			insertInStack(s, temp);
		} else {
			return;
		}

	}

	private static void insertInStack(Stack<Integer> stack, Integer item) {
		if (stack.isEmpty()) {
			stack.push(item);
			return;
		} else {
			Integer temp = stack.pop();
			insertInStack(stack, item);
			stack.push(temp);
		}
	}
}
