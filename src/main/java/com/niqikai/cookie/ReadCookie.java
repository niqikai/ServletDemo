package com.niqikai.cookie;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ReadCookie extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=utf-8");
        PrintWriter out = resp.getWriter();

        Cookie[] cookies  = req.getCookies();

        System.out.println( "cookies length == " + cookies.length);
        for ( Cookie cookie: cookies) {
            out.println("name = " + cookie.getName() + " value = " + cookie.getValue());
            out.println("\n");
        }
        out.println();

    }
}
