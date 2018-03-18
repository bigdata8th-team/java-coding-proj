package com.java.design_21_strategy;

/*
 * 负责和具体的策略类交互
 */
public class Context {
	private Strategy strategy;
	
	public Context(Strategy strategy) {
		super();
		this.strategy = strategy;
	}
	
	public void printPrice(double s) {
		System.out.println("maney: " + strategy.getPrice(s));
	}
}
