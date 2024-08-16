package com.Spring.Practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public  class PracticeApplication {
	@Autowired
	static test t;
	static testRepo repo;
	@Autowired
	static testDao tdao;
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(PracticeApplication.class, args);
		t=context.getBean(test.class);
		tdao = context.getBean(testDao.class);
		repo = context.getBean(testRepo.class);

//		t.setName("Shyam");
//		t.setAge(3);
//		tdao.saveTest(t);

		t.setId(14);
		t.setName("Ram");
		t.setAge(20);
		tdao.saveTest(t);

		System.out.println();


		tdao.getAll();
//		System.out.println();
//		System.out.println();

//		tdao.getByName("shyam");
//		System.out.println();
//
//
		tdao.deleteByName("Ram");
//		System.out.println();
//
//		tdao.getByName("Shyam");
	}

}
