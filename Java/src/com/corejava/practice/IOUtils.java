package com.corejava.practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class IOUtils {
	private static BufferedReader bf;
	private  static BufferedWriter bw;
	
	public static String readString(){
		bf = new BufferedReader(new InputStreamReader(System.in));
		String line = "";
		try {
			line = bf.readLine();
			bf.close();
		} catch (IOException e) {
			System.err.println("Error while reading input String");
			e.printStackTrace();
		}
		return line;
	}
	
 public static int readInt(){
	 bf = new BufferedReader(new InputStreamReader(System.in));
	 String line = "";
	 int num =0;
	 try{
		 line = bf.readLine();
		 try{
		num = Integer.parseInt(line);
		 }
		 catch(NumberFormatException nfe){
			 System.err.println("Not valid number !!!");
		 }
		 
	 }
	 catch(IOException ie){
		 System.err.println("Error occured while reading integer from IO");
		 ie.printStackTrace();
	 }
	  
	 return num;
 }
	
}
