package com.java.design_03_builder;

/*
 * 
 * Builder
 * Ϊ����һ��Product����ĸ�������ָ������ӿ�
 * 
 */
public interface PersonBuilder {
	void buildHead();
	void buildBody();
	void buildFoot();
	Person buildPerson();
}
