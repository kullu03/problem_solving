package com.practice.ds.map;

public class Test {

	public static void main(String[] args) {
		TMHashMap<Employee,String> map = new TMHashMap<>();
		map.put(new Employee(1, "Kulddep"), "Singh");
		map.put(new Employee(2, "Kullu"), "Sultanpur");
		System.out.println(map);
		TMHashMap<String,Integer> m = new TMHashMap<>();
		m.put("k", new Integer(1));
		m.put("ku", 2);
		System.out.println(m);
	}

}
