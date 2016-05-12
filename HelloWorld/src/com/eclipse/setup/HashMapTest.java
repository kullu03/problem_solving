package com.eclipse.setup;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class HashMapTest {
	public static void main(String[]args) {
		 int [] arr = {10,34,5,10,3,5,10};
		 Map<Integer,Integer> hmap = new HashMap<Integer,Integer>();
		 Map<Integer,Integer> tmap = new TreeMap<Integer,Integer>();
		 for(int i = 0; i< arr.length; i++){
			 if(hmap.get(arr[i])==null){
				 hmap.put(arr[i], 1);
			 }
			 else{
				 hmap.put(arr[i], hmap.get(arr[i])+1);
			 }
			 // Populate treemap
			 if(tmap.get(arr[i])==null){
				 tmap.put(arr[i], 1);
			 }
			 else{
				 tmap.put(arr[i], tmap.get(arr[i])+1);
			 }
			
		 }
		 System.out.println("printing hashmap keyvalue pair");
		printMap(hmap);
		System.out.println("printing treemap keyvalue pair");

		printMap(tmap);
	}


	private static void printMap(Map<Integer, Integer> tmap) {
		for(Entry<Integer, Integer>e: tmap.entrySet()){
			System.out.println(e.getKey() + ": " + e.getValue());
		}
		
		}

}
