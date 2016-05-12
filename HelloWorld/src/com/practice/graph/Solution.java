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
            for(int i = 0 ; i < s1.length(); i++){
                for(int j =0 ; j< s2.length();j++){
                    if(s2.contains(""+s1.charAt(i))){
                        System.out.println("YES");
                        break;
                    }
                }
            }
            System.out.println("NO");
        }
    }
}