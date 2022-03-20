package com.javainuse.student;

public class Student {
       private int student_number;
       private String student_name;
       
       
       public Student(){
    	   
       }
       
       
       public Student(int student_number, String student_name){
    	   this.student_number = student_number;
    	   this.student_name = student_name;
       }

	@Override
	public String toString() {
		return "Student [student_number=" + student_number + ", student_name=" + student_name + "]";
	}

	public int getStudent_number() {
		return student_number;
	}

	public void setStudent_number(int student_number) {
		this.student_number = student_number;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
       
       
       
}
