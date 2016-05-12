package com.eclipse.setup;

import java.util.ArrayList;
import java.util.Collections;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	 Student std1 = new Student("Kuldeep", "Sultanpur", 1);
	 Student std2 = new Student("ARoli", "Ghaziabad", 1);
	 Student std3 = new Student("Manjeet", "Bangalore", 9);
	 Student std4 = new Student("Manu", "Allahabad", 4);
	 Student std5 = new Student("Rooppa", "Lucknow", 4);
	 ArrayList<Student>students = new ArrayList<Student>();
	 students.add(std5);
	 students.add(std4);
	 students.add(std3); 
	 students.add(std2); 
	 students.add(std1);
	 printStudents(students);
	 Collections.sort(students, new StudentComparator());
	 System.out.println("After sort...");
	 printStudents(students);

	}

	private static void printStudents(ArrayList<Student> students) {
		for(Student student : students){
			System.out.println(student);
		}
		
	}

}
