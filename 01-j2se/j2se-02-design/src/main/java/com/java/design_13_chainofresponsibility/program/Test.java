package com.java.design_13_chainofresponsibility.program;

public class Test {
	public static void main(String[] args) {
		Manager aManager = new Manager();
		ProjectManager aPM = new ProjectManager();
		Programmer aProgrammer = new Programmer();
		QA aQA = new QA();
//		Others others = new Others();
		
		aManager.addChain(aPM);
		aPM.addChain(aProgrammer);
		aProgrammer.addChain(aQA);
		
		aManager.sendToChain("Get Project");
	}
}
