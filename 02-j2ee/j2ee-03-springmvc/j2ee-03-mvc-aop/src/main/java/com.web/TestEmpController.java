package com.web;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmpController {
    
    /**
     * 测试查询员工
     */
    @Test
    public void test1() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext(
                "spring-mvc.xml");
        EmpController ctl = ctx.getBean(EmpController.class);
        ctl.find();
    }
}