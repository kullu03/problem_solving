package com.practice.ds.cache;

public class TestCache {

	public static void main(String[] args) {

		LRUCache<Integer, Integer> cache = new LRUCache<>(5);
		cache.put(1, 2);
		cache.put(2, 3);
		cache.put(3, 4);
		cache.put(4, 5);
		cache.put(1, 2);
		cache.put(5, 6);
		System.out.println(cache);

	}

}
