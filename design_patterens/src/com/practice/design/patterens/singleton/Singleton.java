package com.practice.design.patterens.singleton;

public class Singleton {

	private static Singleton singletoonInstance;

	private Singleton() {

	}

	public synchronized Singleton getInstance() {
		if (singletoonInstance == null) {
			return singletoonInstance = new Singleton();
		}

		return singletoonInstance;
	}

}
