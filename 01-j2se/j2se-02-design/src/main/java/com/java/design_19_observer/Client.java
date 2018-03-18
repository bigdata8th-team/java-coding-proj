package com.java.design_19_observer;

public class Client {
	public static void main(String[] args) {
		ConcreteSubject subject = new ConcreteSubject();
		
		// 创建观察者
		ObserverA obs1 = new ObserverA();
		ObserverA obs2 = new ObserverA();
		
		// 将观察者添加都subject的观察队伍中
		subject.attach(obs1);
		subject.attach(obs2);
		
		// 改变subject状态
		subject.setState(5);
		
		// 查询观察者的状态
		System.out.println(obs2.getMystate());
	}
}
