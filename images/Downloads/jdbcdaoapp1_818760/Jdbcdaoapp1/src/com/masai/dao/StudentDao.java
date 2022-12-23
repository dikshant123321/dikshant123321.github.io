package com.masai.dao;

import java.util.List;

import com.masai.exception.StudentException;
import com.masai.model.Student;

public interface StudentDao {
	
	// here this method will take fine grain details.
	public String insertStudentDetails(int roll,String name, String address, int marks);
	
	//here this method will take the coarse grain details
	public String insertStudentDetails2(Student student)throws StudentException;
	
	public int getStudentMarksByRoll(int roll)throws StudentException;

	public Student getStudentDetailsByRoll(int roll)throws StudentException;
	
	public List<Student> getAllStudentDetails()throws StudentException;
	
	
	

}
