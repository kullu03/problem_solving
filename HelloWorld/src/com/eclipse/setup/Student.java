package com.eclipse.setup;

public class Student implements Comparable<Student> {
	private String name;
	private String address;
	private int rollNum;
	
	@Override
	public int compareTo(Student student) {
		// TODO Auto-generated method stub
		if(this.rollNum - student.rollNum == 0){
			return this.name.compareTo(student.name);
		} 
		
		return this.rollNum - student.rollNum;
	}

	@Override
	public String toString() {
		return "name=" + name + ", address=" + address + ", rollNum=" + rollNum ;
	}

	public Student(String name, String address, int rollNum) {
		super();
		this.name = name;
		this.address = address;
		this.rollNum = rollNum;
	}
	
	
	

}
