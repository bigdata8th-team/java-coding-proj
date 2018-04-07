package com;

import java.io.Serializable;

public class Student implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String name;
	private int age;
	transient private String other;//transient 该成员变量不参与序列化

	public Student(String name, int age, String other) {
		super();
		this.name = name;
		this.age = age;
		this.other = other;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", other=" + other + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getOther() {
		return other;
	}

	public void setOther(String other) {
		this.other = other;
	}



	
}
