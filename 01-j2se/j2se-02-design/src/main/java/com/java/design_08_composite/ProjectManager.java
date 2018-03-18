package com.java.design_08_composite;

import java.util.ArrayList;

/*
 * Composite
      �������Ӳ�������Щ��������Ϊ��
      �洢�Ӳ�����
      ��Component�ӿ���ʵ�����Ӳ����йصĲ�����

 */
public class ProjectManager extends Employer {

	public ProjectManager(String name) {
		setName(name);
		employers = new ArrayList<Employer>();
	}
	
	@Override
	public void add(Employer employer) {
		employers.add(employer);
	}

	@Override
	public void delete(Employer employer) {
		employers.remove(employer);
	}

}
