package com.hello.course.courseSpring;

import com.hello.course.courseSpring.model.Alien;
import com.hello.course.courseSpring.model.Laptop;
import com.hello.course.courseSpring.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CourseSpringApplication {

	public static void main(String[] args) {


		ApplicationContext context =  SpringApplication.run(CourseSpringApplication.class,args);
		LaptopService service = context.getBean(LaptopService.class);
		Laptop lap = context.getBean(Laptop.class);

		service.addLaptop(lap);
		Laptop lap1 = context.getBean(Laptop.class);
		lap.compile(); 
		lap1.compile();

		Alien alien = context.getBean(Alien.class);
		alien.setAge(21);
		alien.compile();
	}

}
