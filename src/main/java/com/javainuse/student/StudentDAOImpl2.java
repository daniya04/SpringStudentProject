package com.javainuse.student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDAOImpl2 extends JdbcDaoSupport implements StudentDAO{

	
	@Autowired
	DataSource dataSource;

	@PostConstruct
	private void initialize() {
		setDataSource(dataSource);
	}

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
	public Student getstudent_name(String student_name) {
		for(Student student:studentList){
	    	   if (student.getStudent_name().equals(student_name)){
	    		   return student;
	    	   }
	    	   
	       }
		return null;
	}

	@Override
	public List<Student> getAllStudents() {
		String sql = "SELECT * FROM student";
		List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);
		
		List<Student> result = new ArrayList<Student>();
		for(Map<String, Object> row:rows){
			Student student = new Student();
			student.setStudent_name((String)row.get("student_number"));
			student.setStudent_name((String)row.get("student_name"));
			result.add(student);
		}		return result;
	}

	@Override
	public boolean addstudent(Student student) {
		String sql = "INSERT INTO Student "+
		"(student_number, student_name) VALUES(?,?)";
		getJdbcTemplate().update(sql, new Object[]{
				student.getStudent_number(), student.getStudent_name()
		});
		
		return true;
	}
	
	

}