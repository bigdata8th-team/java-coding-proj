package com.java.design_07_bridge;

public class Trouser extends Clothing {

	@Override
	public void personDressCloth(Person person) {
		System.out.println(person.getType() + "´©¿ã×Ó");
	}

}
