
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t >0){
			String s1 = sc.next();
			String s2 = sc.next();
			if(s1.isEmpty()){
				continue;
			}

			StringBuilder ans = new StringBuilder();
			StringBuilder a = new StringBuilder(s1);
			StringBuilder b = new StringBuilder(s2);
			b = b.reverse();
			a = a.reverse();
			Stack<Character>ss1 = new Stack<Character>();
			Stack<Character>ss2 = new Stack<Character>();
			for(int i = 0; i<s1.length();i++){
				ss1.push(a.charAt(i));
			}

			for(int j = 0; j<s2.length();j++){
				ss2.push(b.charAt(j));
			}

			while(!ss1.isEmpty() && !ss2.isEmpty()){
				char ss1c = ss1.peek();
				char ss2c = ss2.peek();
				if( ss1c > ss2c){
					ans.append(ss2.pop());
				}

				if( ss1c < ss2c){
					ans.append(ss1.pop());
				}

				// if both are same then pop from the stack which has next lesser letter
				int kk = ss1.indexOf(ss1c);
				int pp = ss2.indexOf(ss2c);
				if(ss1c == ss2c){
					
					char aa = ss1c ;
					char bb  = ss2c;
					while(aa == bb && kk < ss1.size() && pp<ss2.size()){
						aa = ss1.get(kk);
						bb = ss2.get(pp);
						kk = kk+1;
						pp = pp+1;

					}
					if(aa < bb){
						ans.append(ss1.pop());

					}
					else{
						ans.append(ss2.pop());
					}

				}
				
				// check if whole string is same then it does not matter from where to pop first
				if( kk == ss1.size()-1 && pp == ss2.size()-1){
					if(!ss1.isEmpty()){
					ans.append(ss1.pop());
					}
				}
			}
			// now add rest one to ans
			if(!ss1.isEmpty()){
				while(!ss1.isEmpty()){
					ans.append(ss1.pop());
				}
			}

			// now add rest one to ans
			if(!ss2.isEmpty()){
				while(!ss2.isEmpty()){
					ans.append(ss2.pop());
				}
			}
			
			t =t-1;
			System.out.println(ans.toString());
		}
	}
}