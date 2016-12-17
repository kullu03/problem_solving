package com.intw.practice.array;

public class Reverse {

	public static void main(String[] args) {

		StringBuilder output = new StringBuilder();
		reverse("abcd", output, 0);
		System.out.println(output.toString());

	}

	private static void reverse(String input, StringBuilder output, int i) {

		if (input.length() == i) {
			return;
		}

		reverse(input, output, i + 1);
		output.append(input.charAt(i));

	}

}
