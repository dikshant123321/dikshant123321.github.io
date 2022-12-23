package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.StudentDao;
import com.masai.dao.StudentDaoImpl;
import com.masai.exception.StudentException;

public class GetMarksUseCase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Roll");
		int roll = sc.nextInt();

		StudentDao dao = new StudentDaoImpl();

		try {
		int marks = dao.getStudentMarksByRoll(roll);
		
		System.out.println("The Marks is :"+marks);

		}catch(StudentException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
