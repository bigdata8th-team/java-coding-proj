package com.java.design_07_bridge;

public class Lady extends Person {

	public Lady() {
		setType("Ů��");
	}
	
	@Override
	public void dress() {
		Clothing clothing = getClothing();
        clothing.personDressCloth(this);
	}

}
