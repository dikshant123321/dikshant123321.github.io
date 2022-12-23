package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.StudentDao;
import com.masai.dao.StudentDaoImpl;
import com.masai.model.Student;

public class InsertStudentUseCase2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Roll");
		int roll= sc.nextInt();
		
		System.out.println("Enter Name");
		String name= sc.next();
		
		System.out.println("Enter Address");
		String address= sc.next();
		
		System.out.println("Enter Marks");
		int marks= sc.nextInt();
		
		
		

		//StudentDaoImpl dao = new StudentDaoImpl();

		//here we get more polymorphic way.. to assign any other implementation also
		StudentDao dao = new StudentDaoImpl();
		
		Student student = new Student();
		student.setRoll(roll);
		student.setName(name);
		student.setAddress(address);
		student.setMarks(marks);
		
		//5:27pm
		
		String result= dao.insertStudentDetails2(student);
		
		System.out.println(result);
		
		
	}

}
