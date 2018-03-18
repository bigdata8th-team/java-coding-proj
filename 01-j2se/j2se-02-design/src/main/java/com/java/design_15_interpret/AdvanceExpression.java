package com.java.design_15_interpret;

public class AdvanceExpression extends Expression {

	@Override
	void interpret(Context ctx) {
		System.out.println("这个是高级的解析器");
	}

}
