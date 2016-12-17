package com.intw.practice.array;

import java.util.ArrayDeque;
import java.util.Deque;

public class Queue<T> {

	// stack for enqueue the new element
	private Deque<T> stack1;

	// stack for dequeue the existing element.
	private Deque<T> stack2;

	// Initialize both stack
	public Queue() {
		stack1 = new ArrayDeque<>();
		stack2 = new ArrayDeque<>();
	}

	public void enqueue(T t) {
		while (!stack2.isEmpty()) {
			stack1.push(stack2.pop());
		}
		stack1.push(t);
	}

	public T dequeue() {

		while (!stack1.isEmpty()) {

			stack2.push(stack1.pop());
		}

		if (stack2.isEmpty()) {
			return stack2.pop();
		}

		return null;
	}

}
