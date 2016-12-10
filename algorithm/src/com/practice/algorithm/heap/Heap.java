package com.practice.algorithm.heap;

public class Heap<T extends Comparable<T>> {
	private T[] heap;
	private int heapSize;

	public Heap(T[] arr) {
		this.heap = arr;
		this.heapSize = arr.length;
	}

	public T[] buildMaxHeap() {
		if (this.heap == null || this.heap.length == 0) {
			return null;
		}

		for (int heapIndex = heapSize / 2; heapIndex >= 0; heapIndex--) {
			ensureMaxHeapProperty(heapIndex);
		}
		return heap;
	}

	public T[] sort() {
		buildMaxHeap();
		int n = heapSize - 1;
		for (int lastIndex = n; lastIndex >= 0; lastIndex--) {
			T temp = heap[0];
			heap[0] = heap[lastIndex];
			heap[lastIndex] = temp;
			heapSize = heapSize - 1;
			ensureMaxHeapProperty(0);
		}
		return heap;
	}
	
	public T getNthMax(int n) {
		buildMaxHeap();
		for (int i = n; i > 1; i--) {
			heap[0] = heap[heapSize - 1];
			heapSize = heapSize - 1;
			ensureMaxHeapProperty(0);
		}
		return heap[0];

	}

	private void ensureMaxHeapProperty(int currentIndex) {
		int leftChildIndex = (2 * currentIndex) + 1;
		int rightChildIndex = (2 * currentIndex) + 2;
		int largestElementIndex = -1;
		if (leftChildIndex <= heapSize - 1 && heap[leftChildIndex].compareTo(heap[currentIndex]) >= 0) {
			largestElementIndex = leftChildIndex;
		} else {
			largestElementIndex = currentIndex;
		}

		if (rightChildIndex <= heapSize - 1 && heap[rightChildIndex].compareTo(heap[largestElementIndex]) >= 0) {
			largestElementIndex = rightChildIndex;
		}

		if (largestElementIndex != currentIndex) {
			T temp = heap[currentIndex];
			heap[currentIndex] = heap[largestElementIndex];
			heap[largestElementIndex] = temp;
			ensureMaxHeapProperty(largestElementIndex);
		} else {
			return;
		}
	}

}
