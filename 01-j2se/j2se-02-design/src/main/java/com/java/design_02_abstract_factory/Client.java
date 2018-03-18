package com.java.design_02_abstract_factory;

public class Client {
	public static void main(String[] args) {
		IAnimalFactory blackAnimalFactory = new BlackAnimalFactory();
		ICat blackCat = blackAnimalFactory.createCat();
		IDog blackDog = blackAnimalFactory.CreateDog();
		blackCat.eat();
		blackDog.eat();
		
		IAnimalFactory whiteAnimalFactory = new WhiteAnimalFactory();
		ICat whiteCat = whiteAnimalFactory.createCat();
		IDog whiteDog = whiteAnimalFactory.CreateDog();
		whiteCat.eat();
		whiteDog.eat();
	}
}
