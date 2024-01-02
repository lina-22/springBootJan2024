package com.devLina.StudentMngSystem;

import com.devLina.StudentMngSystem.entity.Student;
import com.devLina.StudentMngSystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentMngSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(StudentMngSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
//		Student student1 = new Student("Lina", "Fahinur","lina@gmail.com");
//		studentRepository.save(student1);
//
//		Student student2 = new Student("Nahid", "Nahid","Nahid@gmail.com");
//		studentRepository.save(student2);
//
//		Student student3 = new Student("Kashif", "Kashif","Kashif@gmail.com");
//		studentRepository.save(student3);
//
//		Student student4 = new Student("Kaisan", "Kaisan","Kaisan@gmail.com");
//		studentRepository.save(student4);

	}
}
