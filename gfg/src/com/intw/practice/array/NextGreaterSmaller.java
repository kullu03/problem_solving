package com.intw.practice.array;

public class NextGreaterSmaller {

	public static void main(String[] args) {
		
		int [] input = {5,1,9,2,5,1,7};
		int [] out = new int [input.length];
		
		getNext(input,out);
		System.out.println(out);

	}

	private static void getNext(int[] input, int[] out) {
		
		for (int i = 0; i < input.length; i++) {
			
			boolean found = false;
			int greater = -1;
			
			for(int j = i +1; j < input.length-1; j++){
				
				if(!found && input[j] > input[i]){
					greater = input [j];
					found = true;
				}
				
				if(found && input[j] < greater){
					out[i] = input[j];
					break;
				}
				
				
			}
			if(!found){
				out[i] = -1;
			}
		}
		
	}

}
