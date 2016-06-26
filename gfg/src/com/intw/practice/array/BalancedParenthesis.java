package com.intw.practice.array;

import java.util.Scanner;
import java.util.Stack;

/*
 * Given an expression string exp, write a program to examine whether the pairs and the orders 
 * of “{“,”}”,”(“,”)”,”[“,”]” are correct in exp. For example, 
 * the program should print true for exp = “[()]{}{[()()]()}” 
 * and false for exp = “[(])”
 * 
 */

public class BalancedParenthesis {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String inp = reader.nextLine();
		Stack<Character>stack = new Stack<>();
		char [] c = inp.toCharArray();
		for(int i =0; i < c.length; i++){
			if(inp.charAt(i) == '(' || inp.charAt(i) == '{' || inp.charAt(i)=='['){
				stack.push(inp.charAt(i));
			}
			
			else if(inp.charAt(i) == ')' && stack.peek() == '('){
				stack.pop();
			}
			
			else if(inp.charAt(i) == '}' && stack.peek() == '{'){
				stack.pop();
			}
			else if(inp.charAt(i) == ']' && stack.peek() == '['){
				stack.pop();
			}
			else{
				//stack.push(inp.charAt(i));
			}
			
		}
		
		if(stack.isEmpty()){
			System.out.println("Yes");
		}
		else{
			System.out.println("NO");
		}
		
	}

}
