package com.masai.usecases;

import java.util.List;

import com.masai.dao.StudentDao;
import com.masai.dao.StudentDaoImpl;
import com.masai.exception.StudentException;
import com.masai.model.Student;

public class GetAllStudentUseCase {

	public static void main(String[] args) {
		
		
		StudentDao dao = new StudentDaoImpl();
		
		try {
		List<Student> students= dao.getAllStudentDetails();
		
		students.forEach(student -> {
			
			System.out.println("Roll no: "+student.getRoll());
			System.out.println("Name is: "+student.getName());
			System.out.println("Address is: "+student.getAddress());
			System.out.println("Marks is: "+student.getMarks());
			
			System.out.println("============================");
			
		});
		
		
		
		}catch(StudentException e) {
			System.out.println(e.getMessage());
		}
		
		

	}

}
