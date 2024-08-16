package com.Sprinng.Servlet;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

import java.io.IOException;
import java.io.PrintWriter;

public class helloServlet extends HttpServlet {

//    public static void main(String[] args) {
//        System.out.println("hello world");
//        Tomcat tm = new Tomcat();
//        try {
//            tm.start();
//            tm.getServer().await();
//        } catch (LifecycleException e) {
//            throw new RuntimeException(e);
//        }
//
//        Context context=tm.addContext("",null);
//        tm.addServlet(context, "HelloServlet",new helloServlet());
//
//    }

    public void service(HttpServletRequest request , HttpServletResponse response) throws IOException {
        System.out.println("hello world");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h2><b>hello</b></h2>");

    }
}


