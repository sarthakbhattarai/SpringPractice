package com.Sprinng.Servlet;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ServletApplicationTests {

	public static void main(String[] args) {
		System.out.println("hello world");
		Tomcat tm = new Tomcat();


		Context context=tm.addContext("",null);
		tm.addServlet(context, "HelloServlet",new helloServlet());
		context.addServletMappingDecoded("/hello","HelloServlet");
		try {
			tm.start();
			tm.getServer().await();
		} catch (LifecycleException e) {
			throw new RuntimeException(e);
		}
	}

}
