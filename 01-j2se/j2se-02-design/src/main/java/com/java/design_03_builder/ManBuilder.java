package com.java.design_03_builder;

/*
 * 
 * ConcreteBuilder
 * 实现Builder的接口以构造和装配该产品的各个部件。
 * 定义并明确它所创建的表示。
 * 提供一个检索产品的接口。
 * 
 */

public class ManBuilder implements PersonBuilder {

	Person person;
	
	public ManBuilder() {
		person = new Man();
	}
	
	@Override
	public void buildHead() {
		person.setHead("建造男人的头");
	}

	@Override
	public void buildBody() {
		person.setBody("建造男人的身体");
	}

	@Override
	public void buildFoot() {
		person.setFoot("建造男人的脚");
	}

	@Override
	public Person buildPerson() {
		return person;
	}

}
