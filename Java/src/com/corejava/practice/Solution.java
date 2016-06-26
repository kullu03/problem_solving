package com.corejava.practice;



import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        // first input string
        String input1 = sc.nextLine();
        String input2 = sc.nextLine();
        // convert string to stringbuilder 
        StringBuilder sb1 = new StringBuilder(input1);
        StringBuilder sb11 = new StringBuilder(input1);
        StringBuilder sb2 = new StringBuilder(input2);
        StringBuilder sb21 = new StringBuilder(input2);
        // store number of delete op
        int c = 0;
        Map<Character,Integer>map1 = new HashMap<Character,Integer>();
        Map<Character,Integer>map2 = new HashMap<Character,Integer>();
        initMap(map1);
        initMap(map2);
        // populate hashmap with char and count of char
        for(int i =0; i< sb1.length(); i++){
        	  if(map1.get(sb1.charAt(i)) == null){
                  map1.put(sb1.charAt(i),1);
              }
            else{
                int cc = map1.get(sb1.charAt(i));
                map1.put(sb1.charAt(i),cc+1);
            }
             
               
           
        }
        // populate map2 with char and count of char
          for(int k =0; k< sb2.length(); k++){
              if(map2.get(sb2.charAt(k)) == null){
                  map2.put(sb2.charAt(k),1);
              }
            else{
                int cc1 = map2.get(sb2.charAt(k));
                map2.put(sb2.charAt(k),cc1+1);
            }        
        }
        
        // now take the absolute diff of both map1 and map2 and print it
         for(Character a:map1.keySet()){
             c =  c + Math.abs(map1.get(a)-map2.get(a));
        }
        
        System.out.println(""+c);
    }
    public static void initMap( Map<Character,Integer>map1){
        char c = 'a';
        for(int i =1; i <=26; i++){
            map1.put(c,0);
            c = (char)(c+1);
        }
    }
}