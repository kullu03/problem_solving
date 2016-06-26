package com.practice.design.patterens.factory;

public class PizzaStore {
	private SimplePizzaFactory factory;
	
	public SimplePizzaFactory getFactory() {
		return factory;
	}

	public void setFactory(SimplePizzaFactory factory) {
		this.factory = factory;
	}

	public void orderPizza(String type){
		Pizza pizza;
		pizza = factory.createPizza(type);
		
		//
		pizza.bake();
		pizza.prepare();
		pizza.cut();
		pizza.box();
		
	}

}
