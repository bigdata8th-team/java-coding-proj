package com.java.design_02_abstract_factory;

/*
 * 
 * ConcreteProduct
 * ����һ��������Ӧ�ľ��幤�������Ĳ�Ʒ����
 * 
 */
public class WhiteCat implements ICat {

	@Override
	public void eat() {
		System.out.println("the white cat is eating");
	}

}
