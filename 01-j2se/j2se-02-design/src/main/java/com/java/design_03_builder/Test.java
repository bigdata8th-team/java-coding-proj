package com.java.design_03_builder;

public class Test {
	public static void main(String[] args) {
		PersonDirector personDirector = new PersonDirector();
		ManBuilder manBuilder = new ManBuilder();
		Man hank = (Man) personDirector.constructPerson(manBuilder);
		System.out.println(hank.getHead());
		System.out.println(hank.getBody());
		System.out.println(hank.getFoot());
	}
}
