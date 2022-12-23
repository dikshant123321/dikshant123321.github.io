package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.StudentDao;
import com.masai.dao.StudentDaoImpl;
import com.masai.model.Student;

public class GetStudentUseCase {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Roll");
		int roll = sc.nextInt();

		StudentDao dao = new StudentDaoImpl();

		
		Student student= dao.getStudentDetailsByRoll(roll);
		
		if(student != null) {
			System.out.println("Roll is :"+student.getRoll());
			System.out.println("Name is :"+student.getName());
			System.out.println("Address is :"+student.getAddress());
			System.out.println("Marks is :"+student.getMarks());
		}
		else
			System.out.println("Student does not exist..");
		
		
		
		
		

	}

}
