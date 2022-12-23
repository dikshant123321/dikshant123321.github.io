package com.masai.dao;

import java.sql.ResultSet;
import java.util.List;

import com.masai.model.Student;

public interface StudentDao {
	
	// here this method will take fine grain details.
	public String insertStudentDetails(int roll,String name, String address, int marks);
	
	//here this method will take the coarse grain details
	public String insertStudentDetails2(Student student);
	
	public int getStudentMarksByRoll(int roll);

	public Student getStudentDetailsByRoll(int roll);
	
	public List<Student> getAllStudentDetails();
	
	
	

}
