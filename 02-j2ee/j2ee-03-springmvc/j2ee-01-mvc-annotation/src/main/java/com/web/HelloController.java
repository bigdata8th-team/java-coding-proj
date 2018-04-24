package com.web;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * 控制器需要实现Controller接口
 */
public class HelloController implements Controller {
	
    public ModelAndView handleRequest(HttpServletRequest request,
                                      HttpServletResponse response) throws Exception {
        System.out.println("Hello, Controller.");
        return new ModelAndView("jsp/hello");
    }
}