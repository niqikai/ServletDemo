package com.niqikai.servletdemo;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

public class GenericHello extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        try {
            servletResponse.getWriter().println("");
            servletResponse.getWriter().println("<html>");
            servletResponse.getWriter().println("<head></head>");
            servletResponse.getWriter().println("<h1>ha ha ha</h1>");
            servletResponse.getWriter().println("<h2>Hello extends Generic</h2>");
            servletResponse.getWriter().println("</body>");
            servletResponse.getWriter().println("</html>");


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
