package com.javainuse.student;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{


	@Autowired
	private StudentDAO studentdao;

	
	@Override
	public Student getstudent_number(int student_number) {
		System.out.println("Inside Service11111");
		return null;
	}



	@Override
	public boolean addstudent(Student student) {
		return studentdao.addstudent(student);
		
	}


	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentdao.getAllStudents();
	}


	@Override
	public Student getstudent_name(String student_name) {
		return studentdao.getstudent_name(student_name);
	}

}
