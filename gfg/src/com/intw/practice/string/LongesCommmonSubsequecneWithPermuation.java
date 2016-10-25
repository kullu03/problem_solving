package com.intw.practice.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LongesCommmonSubsequecneWithPermuation {

	public static void main(String[] args) {
		System.out.println(getLonestCommonSubsequence("pink", "kite"));
		System.out.println(getLonestCommonSubsequence("working", "women"));
		System.out.println(getLonestCommonSubsequence("geeks", "cake"));
		System.out.println(getLonestCommonSubsequence("aaaa", "baba"));

	}

	private static String getLonestCommonSubsequence(String firstStr, String secondStr) {
		Map<Character, Integer> firstMap = new HashMap<Character, Integer>();
		Map<Character, Integer> secondMap = new HashMap<Character, Integer>();

		StringBuilder output = new StringBuilder();
		int lastIndex = firstStr.length() - 1;
		for (int startIndex = 0; startIndex <= lastIndex; startIndex++) {
			Character ch = firstStr.charAt(startIndex);
			if (firstMap.containsKey(ch)) {
				firstMap.put(ch, firstMap.get(ch) + 1);
			} else {
				firstMap.put(ch, 1);
			}

		}

		int lastIndexS2 = secondStr.length() - 1;
		for (int startIndex = 0; startIndex <= lastIndexS2; startIndex++) {
			Character ch = secondStr.charAt(startIndex);
			if (secondMap.containsKey(ch)) {
				secondMap.put(ch, secondMap.get(ch) + 1);
			} else {
				secondMap.put(ch, 1);
			}

		}

		// sort the output.

		for (Map.Entry<Character, Integer> entry : firstMap.entrySet()) {

			output.append(minChar(entry.getKey(), entry.getValue(), secondMap.get(entry.getKey())));

		}

		char[] out = output.toString().toCharArray();
		Arrays.sort(out);

		return new String(out);
	}

	private static String minChar(Character c, Integer first, Integer second) {
		if (first == null || second == null) {
			return "";
		}

		int min = first <= second ? first : second;

		StringBuilder sb = new StringBuilder();

		for (int i = 1; i <= min; i++) {
			sb.append(c);
		}

		return sb.toString();
	}

}
