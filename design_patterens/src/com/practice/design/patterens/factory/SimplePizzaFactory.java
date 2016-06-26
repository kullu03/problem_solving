package com.practice.design.patterens.factory;

public class SimplePizzaFactory {

	public Pizza createPizza(String type) {
		Pizza pizza = null;
		
		if(type.equals("Veggi")){
			pizza = new VeggiePizza();
		}
		
		if(type.equals("NonVeg")){
			pizza = new NVPizza();
			
		}
		
		if(type.equals("CheezPizza")){
			pizza = new CheezePizza();
		}
		return pizza;
		
	}

}
