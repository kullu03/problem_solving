package com.practice.design.patterens.factory;

public class NVPizza extends Pizza{
	String type;
	
	
	@Override
	public void prepare() {
		System.out.println("preparing pizza.." +type);
		
	}

	@Override
	public void bake() {
		System.out.println("baking pizza.." +type);
		
	}

	@Override
	public void cut() {
		System.out.println("cutting pizza.." +type);
		
	}

	@Override
	public void box() {
		System.out.println("boxing pizza.." +type);
		
	}

}
