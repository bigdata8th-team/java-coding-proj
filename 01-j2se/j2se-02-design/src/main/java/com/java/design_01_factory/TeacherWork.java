package com.java.design_01_factory;

public class TeacherWork implements Work {

	@Override
	public void doWork() {
		System.out.println("老师审批作业");
	}

}
