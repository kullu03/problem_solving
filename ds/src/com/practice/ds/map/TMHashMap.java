package com.practice.ds.map;


/**
 * This is an attempt to come up with my own hash data structure. This
 * illustration does not cover all the corner cases of actual hashmap but it
 * gives a good understanding on how we can come up with our own hash
 * implementations
 * 
 * @author ntallapa
 *
 */
public class TMHashMap<K,V> {
	// for simplicity size is taken as 2^4
	private static final int SIZE = 16;
	private Entry<K,V> table[] = new Entry[SIZE];

	/**
	 * User defined map data structure with key and value.
	 * 
	 * This is also used as linked list in case multiple key-value pairs lead to
	 * the same bucket with same hashcodes and different keys (collisions) using
	 * the pointer 'next'.
	 *
	 * @author Kuldeep
	 */
	class Entry<K,V> {
		K key;
		V value;
		Entry<K,V> next;

		public Entry(K k, V v) {
			key = k;
			value = v;
		}

		public V getValue() {
			return value;
		}

		public void setValue(V value) {
			this.value = value;
		}

		public K getKey() {
			return key;
		}
	}

	/**
	 * * REFERENCE: JAVA SOURCE CODE *
	 * 
	 * Applies a supplemental hash function to a given hashCode, which defends
	 * against poor quality hash functions. This is critical because HashMap
	 * uses power-of-two length hash tables, that otherwise encounter collisions
	 * for hashCodes that do not differ in lower bits. Note: Null keys always
	 * map to hash 0, thus index 0.
	 */
	private int getSupplementalHash(int h) {
		// This function ensures that hashCodes that differ only by
		// constant multiples at each bit position have a bounded
		// number of collisions (approximately 8 at default load factor).
		h ^= (h >>> 20) ^ (h >>> 12);
		return h ^ (h >>> 7) ^ (h >>> 4);
	}

	/**
	 * It makes sure the bucket number falls within the size of the hashmap
	 * 
	 * @param hash
	 * @return returns index for hashcode hash
	 */
	private int getBucketNumber(int hash) {
		return hash & (SIZE - 1);
	}

	/**
	 * Associates the specified value with the specified key in this map. If the
	 * map previously contained a mapping for the key, the old value is
	 * replaced.
	 */
	public void put(K key, V value) {
		// get the hashcode and regenerate it to be optimum
		int userHash = key.hashCode();
		int hash = getSupplementalHash(userHash);

		// compute the bucket number (0-15 based on our default size)
		// this always results in a number between 0-15
		int bucket = getBucketNumber(hash);
		Entry<K,V> existingElement = table[bucket];

		for (; existingElement != null; existingElement = existingElement.next) {

			if (existingElement.key.equals(key)) {
				System.out
						.println("duplicate key value pair, replacing existing key "
								+ key + ", with value " + value);
				existingElement.value = value;
				return;
			} else {
				System.out.println("Collision detected for key " + key
						+ ", adding element to the existing bucket");

			}
		}

		//
		System.out.println("PUT adding key:" + key + ", value:" + value
				+ " to the list");
		Entry<K,V> entryInOldBucket = new Entry<K,V>(key, value);
		entryInOldBucket.next = table[bucket];
		table[bucket] = entryInOldBucket;
	}

	/**
	 * Returns the entry associated with the specified key in the HashMap.
	 * Returns null if the HashMap contains no mapping for the key.
	 */
	public Entry<K,V> get(Employee key) {
		// get the hashcode and regenerate it to be optimum
		int hash = getSupplementalHash(key.hashCode());

		// compute the bucket number (0-15 based on our default size)
		// this always results in a number between 0-15
		int bucket = getBucketNumber(hash);

		// get the element at the above bucket if it exists
		Entry<K,V> existingElement = table[bucket];

		// if bucket is found then traverse through the linked list and
		// see if element is present
		while (existingElement != null) {
			System.out
					.println("Traversing the list inside the bucket for the key "
							+ existingElement.getKey());
			if (existingElement.key.equals(key)) {
				return existingElement;
			}
			existingElement = existingElement.next;
		}

		// if nothing is found then return null
		return null;
	}

	
}