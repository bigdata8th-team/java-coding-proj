package com.java.design_02_abstract_factory;

/*
 * 
 * ConcreteProduct
 * ����һ��������Ӧ�ľ��幤�������Ĳ�Ʒ����
 * 
 */
public class BlackDog implements IDog {

	@Override
	public void eat() {
		System.out.println("the black dog is eating");
	}

}