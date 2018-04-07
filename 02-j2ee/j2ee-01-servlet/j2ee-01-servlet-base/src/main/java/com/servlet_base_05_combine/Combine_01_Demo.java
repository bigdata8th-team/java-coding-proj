package com.servlet_base_05_combine;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class Combine_01_Demo
 */
@WebServlet("/Combine_01_Demo")
public class Combine_01_Demo extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Combine_01_Demo() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
     */
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Combine_01_Demo");
        request.setCharacterEncoding("utf-8");

        String url = request.getRequestURL().toString();
        String str[] = url.split("/");
        String name = str[str.length - 1].split("\\.")[0];

        /*
         *
         * servlet解耦
         *
         */
        switch (name) {
            case "uri":
                System.out.println("URI:" + request.getRequestURI());
                break;
            case "url":
                System.out.println("URL:" + request.getRequestURL());
                break;
        }

        response.sendRedirect("index.html");
    }

}

