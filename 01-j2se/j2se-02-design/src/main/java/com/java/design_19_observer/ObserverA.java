package com.java.design_19_observer;

public class ObserverA implements Observer {

	private int mystate;    // ��Ҫʱ�۲���״̬��Ŀ�����״̬����һ��
	@Override
	public void update(Subject subject) {
		// TODO Auto-generated method stub
		mystate = ((ConcreteSubject)subject).getState();
	}
	
	public int getMystate() {
		return mystate;
	}
	
	public void setMystate(int mystate) {
		this.mystate = mystate;
	}

}
