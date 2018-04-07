package com.servlet_base_08_thread;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Thread_01_Tickets
 */
@WebServlet("/Thread_01_Tickets")
public class Thread_01_Tickets extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public static class Ticket extends Thread {
		static int count = 100;
		//静态成员变量obj，对于线程实例来说是唯一的；这里不能用之前的成员变量，因为一个实例就有一个成员变量，不能当做唯一的锁
		static Object obj = new Object();

		@Override
		public void run() {
			while (true) {
//				synchronized (obj) {// 因为count是共享资源，所以对它的操作要加锁
				if (count > 0) {
					System.out.println("count = " + count);
					count--;
					System.out.println("count = " + count);
				} else {
					System.out.println("count = " + count);
					count++;
					System.out.println("count = " + count);
				}
//				}
			}
		}
	}

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Thread_01_Tickets() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Ticket ticket = new Ticket();
		ticket.run();
		response.sendRedirect("index.html");
	}

}
