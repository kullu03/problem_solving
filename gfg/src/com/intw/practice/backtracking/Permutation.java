package com.intw.practice.backtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Permutation {

	
	public static List<String> getPermutationForString(String input) {
		List<String> permuation = new ArrayList<String>();
		if (input == null || input.isEmpty()) {
			return permuation;
		}
		
		// push intial input into stack
		Stack<PermHolder> s = new Stack<>();
		s.push(new PermHolder(input, ""));
	
		while(!s.isEmpty()){
			// if input is empty then add output to output list
			PermHolder ph = s.pop();
			
			if("".equals(ph.input)){
				permuation.add(ph.output);
			}
			else{
				getStack(s, ph);
			}
		}
		
		
		return permuation;
	}




	private static void getStack(Stack<PermHolder> s, PermHolder ph) {
		String input = ph.input;
		for(int i = 0; i < ph.input.length();i++){
			
			// first char
			if(i ==0){
				s.push(new PermHolder(input.substring(1),ph.output +String.valueOf(input.charAt(0))));
			}
			
			// last char
			else if( i== input.length()-1){
				s.push(new PermHolder(input.substring(0,i),ph.output + String.valueOf(input.charAt(i))));
			}
			// middle char
			else{
				
				String out = ph.output + String.valueOf(input.charAt(i));
				String in = input.substring(0, i) + input.substring(i+1);
				s.push(new PermHolder(in, out));	
			}
		}
		//System.out.println(s.size());
	}
	
	
	
	
	public static void main(String[] args) {
		/*Stack<PermHolder> s = new Stack<>();
		getStack(s,new PermHolder("abcd", ""));*/
		List<String> kk = getPermutationForString("abcdefg");
		for(String s : kk){
			System.out.print(s + ",");
		}
		System.out.println(kk.size());
	}

}

class PermHolder{
	String input;
	String output;
	
	public PermHolder(String input,String output){
		this.input = input;
		this.output = output;
	}
	
	public String getInput(){
		return this.input;
	}
	
	public String getOutput(){
		return this.output;
	}
	
}
