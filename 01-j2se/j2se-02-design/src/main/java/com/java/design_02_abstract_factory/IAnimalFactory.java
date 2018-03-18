package com.java.design_02_abstract_factory;

/*
 * 
 * AbstractFactory
 * 声明一个创建抽象产品对象的操作接口
 * 
 * */
public interface IAnimalFactory {
	ICat createCat();
	IDog CreateDog();
}
