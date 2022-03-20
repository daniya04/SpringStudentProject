/*package com.javainuse.student;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class StudentDAOImpl implements StudentDAO{

	private List<Student> studentList = new ArrayList<>();

	
	
	
	@Override
	public Student getstudent_number(int student_number) {
		System.out.println("Inside DAO");
		for(Student student:studentList){
			if (student.getStudent_number()==student_number){
				return student;
			}
		}
		return null;
	}

	

	@Override
	public boolean addstudent(Student student) {
		studentList.add(student);
		return true;
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentList;
	}

	@Override
	public Student getstudent_name(String student_name) {
		for(Student student:studentList){
	    	   if (student.getStudent_name().equals(student_name)){
	    		   return student;
	    	   }
	    	   
	       }
		
			return null;
		
	}

}
*/