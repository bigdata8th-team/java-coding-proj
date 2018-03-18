package com.java.design_20_state;

/**
 * 状态类的核心类
 * 实现一个具体状态的行为
 * 2012-12-1
 * @author erqing
 *
 */
public class ConcretStateA implements State {
	
	private String value;
	
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public void method() {
		System.out.println("execute the ConcretStateA opt!");
	}
}
