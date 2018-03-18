package com.java.design_07_bridge;

public class Man extends Person {

	public Man() {
        setType("ÄÐÈË");
    }
    
    public void dress() {
        Clothing clothing = getClothing();
        clothing.personDressCloth(this);
    }


}
