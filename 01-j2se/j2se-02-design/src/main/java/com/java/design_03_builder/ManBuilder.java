package com.java.design_03_builder;

/*
 * 
 * ConcreteBuilder
 * ʵ��Builder�Ľӿ��Թ����װ��ò�Ʒ�ĸ���������
 * ���岢��ȷ���������ı�ʾ��
 * �ṩһ��������Ʒ�Ľӿڡ�
 * 
 */

public class ManBuilder implements PersonBuilder {

	Person person;
	
	public ManBuilder() {
		person = new Man();
	}
	
	@Override
	public void buildHead() {
		person.setHead("�������˵�ͷ");
	}

	@Override
	public void buildBody() {
		person.setBody("�������˵�����");
	}

	@Override
	public void buildFoot() {
		person.setFoot("�������˵Ľ�");
	}

	@Override
	public Person buildPerson() {
		return person;
	}

}
