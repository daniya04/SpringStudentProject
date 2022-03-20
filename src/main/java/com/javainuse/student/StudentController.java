package com.javainuse.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	@Autowired
	private StudentService studentservice;
	
	@RequestMapping("/hello")
	public String firstPage() {
		System.out.println("Inside Controller");
		studentservice.getstudent_number(11);
		studentservice.getstudent_name("Daniya");
		return "Hello World";
	}

	

	@RequestMapping("/student")
	public Student firstPage(@RequestParam int student_number) {
		System.out.println("Inside Controller");
		return studentservice.getstudent_number(student_number);
	}



	@GetMapping("/student/name")
	public Student getstudent_name(@RequestParam String student_name) {
		return studentservice.getstudent_name(student_name);
	}

	@PostMapping("/add/student/")
	public boolean saveStudent(@RequestBody Student student) {
		return studentservice.addstudent(student);
	}
	@GetMapping("/students")
	public List<Student> getAllStudents() {
		return studentservice.getAllStudents();
	}

}
