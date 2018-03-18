package com.java.design_19_observer;

public class ObserverA implements Observer {

	private int mystate;    // 需要时观察者状态和目标对象状态保持一致
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
