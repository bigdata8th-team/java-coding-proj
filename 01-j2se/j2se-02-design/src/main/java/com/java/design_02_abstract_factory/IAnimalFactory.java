package com.java.design_02_abstract_factory;

/*
 * 
 * AbstractFactory
 * ����һ�����������Ʒ����Ĳ����ӿ�
 * 
 * */
public interface IAnimalFactory {
	ICat createCat();
	IDog CreateDog();
}
