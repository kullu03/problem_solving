package com.intw.practice.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SubstringCounter {

	public static void main(String[] args) {

		String str = "";
		Set<String> subStringSet = getSubstringWithEqualNumOfZerosOneAndTwo("0102010");
		
		Map<Character,Integer>stringCountMap = new HashMap<>();
		int count = 0;
		for(String s : subStringSet){
			
			for( int i = 0; i < s.length() ; i++){
				if(stringCountMap.get(s.charAt(i)) == null){
					stringCountMap.put(s.charAt(i), 1);
				}else{
					stringCountMap.put(s.charAt(i), stringCountMap.get(s.charAt(i)) +1);
				}
			}
			
			if(stringCountMap.get('0').equals(stringCountMap.get('1')) && stringCountMap.get('1').equals(stringCountMap.get('2'))){
				count = count +1;
				System.out.println();
						 
			}
			stringCountMap = new HashMap<>();
			
		}
		

	}

	private static Set<String> getSubstringWithEqualNumOfZerosOneAndTwo(String str) {
		Set<String> subStringSet = new HashSet<String>();
		if (str == null || str.isEmpty()) {
			return subStringSet;
		}
		
		// validate the input that it containsonly 0,1,and 2. if not throw exception that not 
		// input is invalid.
		
		for (int startIndex = 0; startIndex < str.length(); startIndex++) {

			for (int nextIndex = startIndex + 1; nextIndex <= str.length(); nextIndex++) {
				
				subStringSet.add(str.substring(startIndex,nextIndex));

			}
		}
		
		return subStringSet;

	}

}
