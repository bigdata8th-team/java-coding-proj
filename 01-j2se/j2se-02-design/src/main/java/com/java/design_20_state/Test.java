package com.java.design_20_state;

/**
 * 本代码出自博客：http://blog.csdn.net/zhangerqing 
 * email:xtfggef@gmail.com
 * 微博：http://weibo.com/xtfggef
 * @author egg
 */
public class Test {

	public static void main(String[] args) {
		
		State stateA = new ConcretStateA();
		State stateB = new ConcretStateB();
		Context context = new Context(stateA);
		
		//设置第一种状态
		context.setState(stateA);
		context.method();
		
		//设置第二种状态
		context.setState(stateB);
		context.method();
	}
}
