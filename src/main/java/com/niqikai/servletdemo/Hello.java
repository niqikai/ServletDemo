package com.niqikai.servletdemo;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class Hello implements Servlet {
    public void init(ServletConfig servletConfig) throws ServletException {

    } 

    public ServletConfig getServletConfig() {
        return null;
    }

    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("service it");
        PrintWriter printWriter = servletResponse.getWriter();
        printWriter.println("Hello World123");
    }

    public String getServletInfo() {
        return null;
    }

    public void destroy() {

    }
}
