package com.java.design_21_strategy;

public class Client {
	public static void main(String[] args) {
		Strategy s1 = new NewCustomerFewStrategy();
		Context ctx = new Context(s1);
		
		ctx.printPrice(100);
	}
}
