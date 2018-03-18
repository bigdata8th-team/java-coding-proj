package com.java.design_08_composite;

import java.util.ArrayList;

/*
 * Component
      Ϊ����еĶ��������ӿڡ�
      ���ʵ�������£�ʵ�������๲�нӿڵ�ȱʡ��Ϊ��
      ����һ���ӿ����ڷ��ʺ͹���Component���������
      (��ѡ)�ڵݹ�ṹ�ж���һ���ӿڣ����ڷ���һ�������������ں��ʵ������ʵ������

 */
public abstract class Employer {
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public abstract void add(Employer employer);
	
	public abstract void delete(Employer employer);
	
	public void printInfo() {
		System.out.println(this.name);
	}
	
	public ArrayList<Employer> employers;
	
	public ArrayList<Employer> getEmployers() {
		return this.employers;
	}
}
