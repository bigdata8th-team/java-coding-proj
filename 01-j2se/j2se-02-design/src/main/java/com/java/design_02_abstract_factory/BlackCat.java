package com.java.design_02_abstract_factory;

/*
 * 
 * ConcreteProduct
 * ����һ��������Ӧ�ľ��幤�������Ĳ�Ʒ����
 * 
 */
public class BlackCat implements ICat {

	@Override
	public void eat() {
		System.out.println("the black cat is eating");
	}

}
