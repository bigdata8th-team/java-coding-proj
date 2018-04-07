package com._04_filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class Filter_01_Func
 */
@WebFilter("/Filter_01_Func")
public class Filter_01_Func implements Filter {
	private FilterConfig config;
    /**
     * Default constructor. 
     */
    public Filter_01_Func() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		request.setCharacterEncoding("utf-8");
		
		String userName = request.getParameter("userName");
		String filterName = config.getInitParameter("filterName");
		
//		System.out.println("userName = " + userName);
//		System.out.println("name = " + filterName);
		
		if (filterName.equals(userName)) {
			System.out.println("您输入了敏感字！");
			//输入敏感字。被转发到filter页面了
			request.getRequestDispatcher("jsp/jsp_04_filter.jsp").forward(request, response);
		} else {
			//如果一切OK，进行过滤器链中的下一个过滤器，继续检查，
			//如果没有下一个过滤器了，就进入url路径所对应的Servlet了
			chain.doFilter(request, response);
		}
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) {
		System.out.println("过滤器初始化函数");
		config = fConfig;
	}

}
