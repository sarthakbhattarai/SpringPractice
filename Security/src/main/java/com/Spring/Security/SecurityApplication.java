package com.Spring.Security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SecurityApplication {

	public static void main(String[] args)
	{
		ApplicationContext context =  SpringApplication.run(SecurityApplication.class, args);
	}

}
