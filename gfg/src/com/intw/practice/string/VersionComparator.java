package com.intw.practice.string;

public class VersionComparator {

	public static void main(String[] args) {
		
		System.out.println(getLateVersion("1.0.3.","1.0.7"));
		System.out.println(getLateVersion("1.0.3","1.0.3.1"));
		System.out.println(getLateVersion("1.0","2.0"));
		System.out.println(getLateVersion("1.1.0","1.0.1"));
		System.out.println(getLateVersion("1.0.0.0","1.0.0.0"));
		System.out.println(getLateVersion("1.0.0.-.0.","1.0.0."));
	}

	private static String getLateVersion(String pv1, String pv2) {
		
		if(pv1.isEmpty() || pv2.isEmpty()){
			throw new IllegalArgumentException("Both product version must be non empty");
		}
		
		// 
		StringBuilder s1 = new StringBuilder();
		StringBuilder s2 = new StringBuilder();
		char [] pv1Arr = pv1.toCharArray();
		char [] pv2Arr = pv2.toCharArray();
		for(int i = 0; i < pv1Arr.length; i ++){
			if(pv1Arr[i] == '.' && pv1Arr[i-1] == '.'){
				throw new IllegalArgumentException("Product version is not in correct format. It seems version contains some where"
						+ " consecutive dots.");
			}
			if(pv1Arr[i] != '.'){
				s1.append(pv1Arr[i]);
			}
		}
		
		for(int i = 0; i < pv2Arr.length; i ++){
			if(pv2Arr[i] == '.' && pv2Arr[i-1] == '.'){
				throw new IllegalArgumentException("Product version is not in correct format. It seems version contains some where"
						+ " consecutive dots.");
			}
			if(pv2Arr[i] != '.'){
				s2.append(pv2Arr[i]);
			}
		}
		
	
		try{
			
			int pv1Int = Integer.parseInt(s1.toString());
			int pv2Int = Integer.parseInt(s2.toString());
			if(pv1Int <= pv2Int) return pv1;
			return pv2;
		}catch(NumberFormatException nfe){
			throw new IllegalArgumentException("provided version is not correct..");
		}
		
	}

}
