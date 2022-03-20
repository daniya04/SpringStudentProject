package com.javainuse.student;

import java.util.ArrayList;
import java.util.List;
public interface StudentDAO {
      
	public Student getstudent_number(int student_number);
	public Student getstudent_name(String student_name);
	public List<Student> getAllStudents();
	
	public boolean addstudent(Student student);
}
