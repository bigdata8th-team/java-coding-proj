package com.java.design_02_abstract_factory;

/*
 * 
 * ConcreteProduct
 * ����һ��������Ӧ�ľ��幤�������Ĳ�Ʒ����
 * 
 */
public class WhiteDog implements IDog {

	@Override
	public void eat() {
		System.out.println("the white dog is eating");
	}

}
