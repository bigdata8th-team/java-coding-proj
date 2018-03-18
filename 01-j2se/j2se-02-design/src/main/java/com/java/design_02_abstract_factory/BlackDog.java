package com.java.design_02_abstract_factory;

/*
 * 
 * ConcreteProduct
 * 定义一个将被相应的具体工厂创建的产品对象。
 * 
 */
public class BlackDog implements IDog {

	@Override
	public void eat() {
		System.out.println("the black dog is eating");
	}

}
