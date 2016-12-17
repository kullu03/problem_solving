package com.practice.algorithm.heap;
/* package whatever; // don't place package name! */
 
import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main( String[] args ){
    Dog aDog = new Dog("Max");
    int arr[] = {0,1,2};
    int arr1 [] = null;
    arrr(arr,arr1);
    foo(aDog);
 
    if (aDog.getName().equals("Max")) { //true
        System.out.println( "Java passes by value." );
 
    } else if (aDog.getName().equals("Fifi")) {
        System.out.println( "Java passes by reference." );
    }
}
 
	public static void arrr(int [] arrrq,int [] arr1){
		arrrq = arr1;
		
	}
public static void foo(Dog d) {
    d.getName().equals("Max"); // true
    d.setName("Fifi");
    /*d = new Dog("Fifi");
    d.getName().equals("Fifi"); // true
*/}
}
class Dog{
	private String name;
 
	public Dog(String name){
		this.name = name;
	}
 
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}
}