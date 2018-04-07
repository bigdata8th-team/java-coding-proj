package com._05_listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class Listener_01_Http
 *
 */
/*
 * 如果要关闭监听器，除了web.xml
 * 还需要注释掉@WebListener这个注解
 */
@WebListener
public class Listener_01_Http implements HttpSessionListener {
	private int count = 0;
	
    /**
     * Default constructor. 
     */
    public Listener_01_Http() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(HttpSessionEvent arg0)  { 
         count++;
         System.out.println("当前浏览人数：" + count);
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent arg0)  { 
         // TODO Auto-generated method stub
    }
	
}
