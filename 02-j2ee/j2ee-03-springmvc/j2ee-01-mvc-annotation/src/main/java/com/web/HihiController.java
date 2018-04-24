package com.web;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * 控制器需要实现Controller接口
 */
public class HihiController implements Controller {
    public ModelAndView handleRequest(HttpServletRequest request,
                                      HttpServletResponse response) {
        System.out.println("Hihi, Controller.");
        return new ModelAndView("jsp/hello");
    }
}