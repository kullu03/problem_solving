package com.eclipse.setup;

public class StringTest {
	
	public static void main(String[]args){
		String s = "Kuldeep";
		StringBuffer sbb = new StringBuffer("StringBuffer");
		StringBuilder sbc = new StringBuilder("StringBuilder");
		System.out.println("before concatenation....");
		concate1(s);
		concate2(sbb);
		concate3(sbc);
		System.out.println("after concatenation....");
		System.out.println(s);
		System.out.println(sbb);
		System.out.println(sbc);
		
	}

	private static void concate3(StringBuilder sbc) {
		// TODO Auto-generated method stub
		sbc.append("Singh");
		System.out.println(sbc);
		
	}

	private static void concate2(StringBuffer sbb) {
		// TODO Auto-generated method stub
		sbb.append("Singh");
		System.out.println(sbb);
		
	}

	private static void concate1(String s) {
		s = s + "Singh";
		System.out.println(s);
		
	}

}
