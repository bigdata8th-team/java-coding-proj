package com.java.design_07_bridge;

public class Test {

	public static void main(String[] args) {
		Person man = new Man();     
        Person lady = new Lady();
        
        man.setClothing(new Jacket());
        lady.setClothing(new Trouser());
        
        man.dress();
        lady.dress();
        
        lady.setClothing(new Jacket());
        man.setClothing(new Trouser());
        
        man.dress();
        lady.dress();
	}

}
