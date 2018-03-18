package com.java.design_20_state;

/**
 * 状态模式的切换类   2012-12-1
 * @author erqing
 * 
 */
public class Context {

	private State state;

	public Context(State state) {
		this.state = state;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public void method() {
		state.method();
	}
}
