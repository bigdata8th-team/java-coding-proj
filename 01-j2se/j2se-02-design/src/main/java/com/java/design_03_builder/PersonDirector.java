package com.java.design_03_builder;

/*
 * 
 * Director
 * 构造一个使用Builder接口的对象。
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
