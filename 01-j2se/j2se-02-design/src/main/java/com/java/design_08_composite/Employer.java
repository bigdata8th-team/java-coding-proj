package com.java.design_08_composite;

import java.util.ArrayList;

/*
 * Component
      为组合中的对象声明接口。
      在适当的情况下，实现所有类共有接口的缺省行为。
      声明一个接口用于访问和管理Component的子组件。
      (可选)在递归结构中定义一个接口，用于访问一个父部件，并在合适的情况下实现它。

 */
public abstract class Employer {
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public abstract void add(Employer employer);
	
	public abstract void delete(Employer employer);
	
	public void printInfo() {
		System.out.println(this.name);
	}
	
	public ArrayList<Employer> employers;
	
	public ArrayList<Employer> getEmployers() {
		return this.employers;
	}
}
