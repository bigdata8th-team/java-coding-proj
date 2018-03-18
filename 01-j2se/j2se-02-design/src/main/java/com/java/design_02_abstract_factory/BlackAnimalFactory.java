package com.java.design_02_abstract_factory;

/*
 * 
 * ConcreteFactory
 * ʵ�ִ��������Ʒ����Ĳ���
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
