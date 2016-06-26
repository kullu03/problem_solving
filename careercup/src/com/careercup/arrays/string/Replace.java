/**
 * 
 */
package com.careercup.arrays.string;

/**
 * @author Kuldeep Singh
 *
 */
public class Replace {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println(replace("an cd egh  kjl   "));

	}

	private static String replace(String string) {
		// TODO Auto-generated method stub
		int cc=0;
		char c[] = string.toCharArray();
		for(int i =0; i < string.length(); i++){
			if((int)string.charAt(i)==32){
				cc = cc+1;
			}
		}
		
		// new length of string
		int nl = string.length() + cc*2;
		char na []= new char[nl];
		
		int j = 0;
		for(int i=0; i < string.length(); i++){
			
			if(string.charAt(i)==' '){
				
				na[j]= '0';
				na[j+1]= '2';
				na[j+2]= '%';
				j= j+3;
			}
			else{
				na[j]= string.charAt(i);
				j = j+1;
			}
			
		}
		return new String(na);
	}

}
