package com.java.design_19_observer;

public class Client {
	public static void main(String[] args) {
		ConcreteSubject subject = new ConcreteSubject();
		
		// �����۲���
		ObserverA obs1 = new ObserverA();
		ObserverA obs2 = new ObserverA();
		
		// ���۲�����Ӷ�subject�Ĺ۲������
		subject.attach(obs1);
		subject.attach(obs2);
		
		// �ı�subject״̬
		subject.setState(5);
		
		// ��ѯ�۲��ߵ�״̬
		System.out.println(obs2.getMystate());
	}
}
