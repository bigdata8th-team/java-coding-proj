package com.java.design_19_observer;

import java.util.ArrayList;
import java.util.List;

/*
 * 主题
 * 
 */

public abstract class Subject {
	private List<Observer> list = new ArrayList<Observer>();
	
	// 注册观察者对象
	public void attach(Observer obs) {
		list.add(obs);
	}
	
	public void detach(Observer obs) {
		list.remove(obs);
	}
	
	// 通知所有观察者对象更新目标状态
	protected void notifyAllObservers() {
		for (int i = 0; i < list.size(); i++) {
			list.get(i).update(this);
			
		}
	}
}
