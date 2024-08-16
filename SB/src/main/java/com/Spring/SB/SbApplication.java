package com.Spring.SB;

import com.Spring.SB.model.Student;
import com.Spring.SB.repo.StdRepo;
import com.Spring.SB.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SbApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SbApplication.class, args);
		Student std = context.getBean(Student.class);
		StdRepo repo =context.getBean(StdRepo.class);
		StudentService ss = context.getBean(StudentService.class);

		ss.setRepo(repo);
		std.setMarks(10);
		std.setName("Ram");
		std.setRollNo(20);

		ss.addStd(std);
		List<Student> stud = ss.getAllStd(std);
		System.out.println(stud);

	}

}
