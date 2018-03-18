package com.java.design_08_composite;

/*
 * Leaf
      在组合中表示叶节点对象，叶节点没有子节点。
      在组合中定义节点对象的行为。

 */
public class ProjectAssistant extends Employer {

	public ProjectAssistant(String name) {
		setName(name);
		employers = null;
	}
	
	@Override
	public void add(Employer employer) {

	}

	@Override
	public void delete(Employer employer) {

	}
	
}
