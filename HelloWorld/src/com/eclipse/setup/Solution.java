package com.eclipse.setup;



import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		int t = sc.nextInt();
		while(t > 0){
			String inp = sc.next();
			// StringBuilder inp1 = new StringBuilder(inp);
			if(isPalindrome(inp,-1)){
				System.out.println("-1");
			}
			else{
               
				for(int i =0; i<inp.length();i++){
					//String s = getNewString(inp,i);
					if(isPalindrome(inp,i)){
						System.out.println(i);
						break;
					}
				}
			}
			t =t-1;
		}
		sc.close();

	}
	private static String getNewString(String inp,int i){
		StringBuilder sb = new StringBuilder(inp);
		return sb.deleteCharAt(i).toString();
	}
	private static boolean isPalindrome(String inp,int j){
		int n = inp.length();
        for(int i = 0; i <= n/2;i++){
            if(inp.charAt(i) !=inp.charAt(n-i-1))
                return false;
        	}
       
        return true;
	}
}
