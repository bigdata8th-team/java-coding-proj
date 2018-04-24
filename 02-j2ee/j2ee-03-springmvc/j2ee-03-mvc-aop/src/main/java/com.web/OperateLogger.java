package com.web;
/**
 *    用于记录日志的方面组件，演示Spring AOP的各种通知类型。
 */
public class OperateLogger {
    /**
     * 前置通知、后置通知、最终通知使用的方法
     */
    public void log1() {
        // 记录日志
        System.out.println("-->记录用户操作信息");
    }
    public void log2() {
        // 记录日志
        System.out.println("-->完结记录用户操作信息");
    }
}