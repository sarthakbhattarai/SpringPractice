package com.telusko.springdatajpaex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.telusko.springdatajpaex.model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class SpringDataJpaExApplication {

	public static void main(String[] args) {
	ApplicationContext context=	SpringApplication.run(SpringDataJpaExApplication.class, args);
	  Student s1= context.getBean(Student.class);
	  Student s2=context.getBean(Student.class);
	  Student s3=context.getBean(Student.class);
	 
	  StudentRepo repo=context.getBean(StudentRepo.class);
	  
//	  s1.setRollNo(101);
//	  s1.setName("Navin");
//	  s1.setMarks(75);
//
//
//	  s2.setRollNo(102);
//	  s2.setName("Kiran");
//	  s2.setMarks(80);
//
//
	  s3.setRollNo(103);
	  s3.setName("Manish");
	  s3.setMarks(90);
//
//	  repo.save(s1);
//	  repo.save(s2);
//	  repo.save(s3);


//		for (Student std : repo.findAll()){
//			System.out.println(std.getRollNo()+" "+std.getName()+" "+std.getMarks());
//		}




//		Optional<Student> s = repo.findById(103);
//		System.out.println(s.get());


//		System.out.println("find by name");
//		System.out.println(repo.findByName("Navin"));
//
//
//		System.out.println("find by Marks");
//		System.out.println(repo.findByMarks(75));
//
//
//		System.out.println("find by Marks grater");
//		System.out.println(repo.findByMarksGreaterThan(69));


		//for update purpose we can use the save function
//		repo.save(s3);

		//to delete
		repo.delete(s2);


	}

}
