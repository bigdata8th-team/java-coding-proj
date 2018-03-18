package com.java.design_19_observer;

import java.util.ArrayList;
import java.util.List;

/*
 * ����
 * 
 */

public abstract class Subject {
	private List<Observer> list = new ArrayList<Observer>();
	
	// ע��۲��߶���
	public void attach(Observer obs) {
		list.add(obs);
	}
	
	public void detach(Observer obs) {
		list.remove(obs);
	}
	
	// ֪ͨ���й۲��߶������Ŀ��״̬
	protected void notifyAllObservers() {
		for (int i = 0; i < list.size(); i++) {
			list.get(i).update(this);
			
		}
	}
}
