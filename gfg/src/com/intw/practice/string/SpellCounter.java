package com.intw.practice.string;

import java.util.HashMap;
import java.util.Map;

public class SpellCounter {

	public static void main(String[] args) {

		System.out.println(getSpellCount2("100"));
		System.out.println(getSpellCount2("11112"));
		System.out.println(getSpellCount2("8884441100"));
		System.out.println(getSpellCount2("12345"));
		System.out.println(getSpellCount2("11111"));

	}

	/*
	 * This is assumed that input String contains only numbers.
	 * 
	 * 
	 */
	private static int getSpellCount(String input) {
		if (input == null || input.isEmpty()) {
			return 0;
		}

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (Character c : input.toCharArray()) {
			if (map.get(c) == null) {
				map.put(c, 1);
			} else {
				map.put(c, map.get(c) + 1);
			}
		}
		int exp = 0;
		for (Map.Entry<Character, Integer> e : map.entrySet()) {

			if (e.getValue() > 1) {
				exp = exp + e.getValue() - 1;
			}
		}
		return (int) Math.pow(2, exp);
	}

	/*
	 * This is assumed that input String contains only numbers.
	 * 
	 * 
	 */
	private static int getSpellCount2(String input) {

		if (input == null || input.isEmpty())
			return 0;

		int count = 1;
		for (int i = 0; i < input.length() - 1; i++) {

			while (i < input.length() - 1 && input.charAt(i) == input.charAt(i + 1)) {
				count = count + 1;
				i = i + 1;
			}
		}

		return (int) Math.pow(2, count - 1);

	}

}
