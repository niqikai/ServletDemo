package com.niqikai.servletdemo;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

public class StartUpServlet extends HttpServlet {



    @Override
    public void init() throws ServletException {
        super.init();
        // init
        System.out.println("init() was called ... ...");
    }



}
