package com.practice.design.patterens.factory;

public class PizzaStoreApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PizzaStore store = new PizzaStore();
		store.setFactory(new SimplePizzaFactory());
		store.orderPizza("Veggi");

	}

}
