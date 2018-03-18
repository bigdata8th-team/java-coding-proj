package com.java.design_02_abstract_factory;

/*
 * 
 * ConcreteFactory
 * ʵ�ִ��������Ʒ����Ĳ���
 * 
 */
public class WhiteAnimalFactory implements IAnimalFactory {

	@Override
	public ICat createCat() {
		return new WhiteCat();
	}

	@Override
	public IDog CreateDog() {
		return new WhiteDog();
	}

}
