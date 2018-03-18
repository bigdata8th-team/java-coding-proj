package com.java.design_20_state;

/**
 * ��������Բ��ͣ�http://blog.csdn.net/zhangerqing 
 * email:xtfggef@gmail.com
 * ΢����http://weibo.com/xtfggef
 * @author egg
 */
public class Test {

	public static void main(String[] args) {
		
		State stateA = new ConcretStateA();
		State stateB = new ConcretStateB();
		Context context = new Context(stateA);
		
		//���õ�һ��״̬
		context.setState(stateA);
		context.method();
		
		//���õڶ���״̬
		context.setState(stateB);
		context.method();
	}
}
