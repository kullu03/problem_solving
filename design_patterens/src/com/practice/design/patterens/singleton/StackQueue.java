package com.practice.design.patterens.singleton;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackQueue {

	public static void main(String[] args) {
		
		Deque<String> queue = new ArrayDeque<String>();
		Deque<String> stack = new ArrayDeque<String>();
		
		/*stack.push("Kullu1");
		stack.push("Kullu2");
		stack.push("Kullu3");
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		stack.push("Kullu4");
		System.out.println(stack.peek());
		*/
		queue.addLast("Kuldeep1");
		queue.addLast("Kuldeep2");
		queue.addLast("Kuldeep3");
		queue.addLast("Kuldeep4");
		
	
		System.out.println(queue.removeFirst());
		queue.addLast("Kuldeep5");
		System.out.println(queue.removeFirst());

		

	}

}
