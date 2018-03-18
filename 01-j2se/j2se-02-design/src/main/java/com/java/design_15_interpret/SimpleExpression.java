package com.java.design_15_interpret;

public class SimpleExpression extends Expression {

	@Override
	void interpret(Context ctx) {
		System.out.println("这个是普通的解析器");
	}

}
