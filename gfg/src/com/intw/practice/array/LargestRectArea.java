package com.intw.practice.array;

import java.util.Scanner;

/**
 * @author Kuldeep Singh
 * 6, 2, 5, 4, 5, 1, 6
 *
 */
public class LargestRectArea {
	public static void main(String [] args){
		Scanner reader  = new Scanner(System.in);
		 int t = reader.nextInt(); 
		int n = reader.nextInt();
		int [] arr = new int[n];
		while( t > 0){
		for(int i = 0; i < n; i++){
			arr[i] = reader.nextInt();
		}
		//int [] arr = new int []{6, 2, 5, 4, 5, 1, 6};
		int max = 0;
		int area = 0;
		//int c = 0;
		
		for(int i = 0; i < arr.length-1; i++){
			int width = 1;
			int minH = arr[i];
			for(int j = i+1; j < arr.length; j++){
				width = width + 1;
				if(minH > arr[j] ){
					minH  = arr[j];
					//area = arr[i]  * (j+1);
				}
				
				//if(j+1 <= arr.length){
				area = minH * width;
				
				if(area > max){
					max = area;
				}
			}
			
		}
		System.out.println(max);
		t =t-1;
		}
	}

}
