package com.java.design_13_chainofresponsibility;

/**
 * 包括用户提交请求的处理接口
 * @author root
 *
 */
public interface RequestHandle {
	void handleRequest(Request request);
}
