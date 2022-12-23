package com.masai.dao;

import com.masai.exception.CourseException;
import com.masai.exception.StudentException;
import com.masai.model.Student;

public interface StudentDao {
	
	
	public String registerStudent(Student student)throws StudentException;
	
	public Student loginStudent(String username, String password)throws StudentException;
	
	public String enrollStudentInCourse(int roll, int cid)throws StudentException, CourseException;
	
	
	
	

}
