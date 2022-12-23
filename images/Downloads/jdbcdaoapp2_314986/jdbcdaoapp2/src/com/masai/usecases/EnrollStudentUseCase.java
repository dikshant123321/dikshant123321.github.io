package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.StudentDao;
import com.masai.dao.StudentDaoImpl;

public class EnrollStudentUseCase {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Roll: ");
		int roll = sc.nextInt();

		System.out.println("Enter Course_id: ");
		int cid = sc.nextInt();
		
		
		StudentDao dao = new StudentDaoImpl();
		
		try {
		String result= dao.enrollStudentInCourse(roll, cid);
		
		System.out.println(result);
		}catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
		
		

	}

}
