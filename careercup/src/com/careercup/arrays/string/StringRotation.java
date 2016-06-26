package com.careercup.arrays.string;

public class StringRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(isRotation1("waterbottle","aterbottlewa"));
		System.out.println(isRotation("erbottle","aterbottlewat"));

	}

	
	private static boolean isRotation(String s1, String s2) {
		
		// The logic is here is that s2 always start either the letter which s1 starts or the letter which s1 ends
		char s = s1.charAt(0);
		char l = s1.charAt(s1.length()-1);
		// find the later part of s2 I mean rotation part and check if starting from 0 to rotation point index-1 is substring of s1
		int i = 0;
		// get the rotation point
		for(;i < s2.length();i++){
			if(s2.charAt(i)==s){
				break;
			}
		}
		
		// from rotation point till end of s2 and start from s1 must be same ..otherwise return false. 
		int f =0;
		for(int j =i; j < s2.length(); j++){
			if(s1.charAt(f) == s2.charAt(j)){
				f++;
			}
			else{
				return false;
			}
		}
		
		
		return isSubString(s2.substring(0,i),s1);
	}

	private static boolean isSubString(String substring, String s1) {
		for(int i =0; i < s1.length();i++){
			String ss2 = s1.substring(i,i+substring.length());
			if(ss2.equals(substring))return true;
		}
		
		
		return false;
	}
	
	// This is taken from careercup book. The idea here is simple .. concatenate the s1 with s1 and check if s2 is substring of s1.
	// why this works ? 
	// because when we double the s1 it will contain the all possible rotation of s1 as substring 
	public static boolean isRotation1(String s1,String s2){
		if(s1.length() == s2.length() && s1.length() >0){
		String s1s1 = s1+s1;
		return isSubString(s2, s1s1);
		}
		return false;
		
	}

}
