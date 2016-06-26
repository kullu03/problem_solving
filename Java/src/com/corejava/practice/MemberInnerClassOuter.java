package com.corejava.practice;

public class MemberInnerClassOuter {
	private String greeting = "Hello";
	public static void main(String [] args) {
		System.out.println("Inside: " + MemberInnerClassOuter.class );
		new MemberInnerClassOuter().new MemberInnerClassInner().sayHello(); 
		
	}
	
	public class MemberInnerClassInner {
		public void sayHello() {
			System.out.println(greeting);
			
		}
		
			
	}
	

}
