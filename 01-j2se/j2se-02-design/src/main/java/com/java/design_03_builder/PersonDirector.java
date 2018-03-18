package com.java.design_03_builder;

/*
 * 
 * Director
 * ����һ��ʹ��Builder�ӿڵĶ���
 * 
 */

public class PersonDirector {
	public Person constructPerson(PersonBuilder pb) {
        pb.buildHead();
        pb.buildBody();
        pb.buildFoot();
        return pb.buildPerson();
    }

}
