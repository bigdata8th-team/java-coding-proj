package com.java.design_21_strategy;

/*
 * ����;���Ĳ����ཻ��
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
