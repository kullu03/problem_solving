package com.intw.practice.array;

public class Test {

	public static void main(String[] args) {
		Queue<String>queue = new Queue<>();
		queue.enqueue("Kullu");
		queue.enqueue("Manu");
		queue.enqueue("Manjeet");
		System.out.println(queue.dequeue());
		queue.enqueue("Anni");
		queue.enqueue("Ansh");
		queue.enqueue("Roli");
		queue.enqueue("Deepa");
		queue.enqueue("Roopa");
		System.out.println(queue.dequeue());
	}

}
