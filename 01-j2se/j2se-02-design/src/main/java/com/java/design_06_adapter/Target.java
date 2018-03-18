package com.java.design_06_adapter;

/*
 * Target
      定义Client使用的与特定领域相关的接口。
 */
public interface Target {
	void adapteeMethod();
	void adapterMethod();
}
