package com.java.design_02_abstract_factory;

/*
 * 
 * ConcreteFactory
 * 实现创建具体产品对象的操作
 * 
 */
public class BlackAnimalFactory implements IAnimalFactory {

	@Override
	public ICat createCat() {
		return new BlackCat();
	}

	@Override
	public IDog CreateDog() {
		return new BlackDog();
	}

}
