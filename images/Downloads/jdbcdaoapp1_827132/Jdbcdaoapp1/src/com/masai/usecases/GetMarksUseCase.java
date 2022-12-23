package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.StudentDao;
import com.masai.dao.StudentDaoImpl;

public class GetMarksUseCase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Roll");
		int roll = sc.nextInt();

		StudentDao dao = new StudentDaoImpl();

		int marks = dao.getStudentMarksByRoll(roll);

		if (marks > 0)
			System.out.println("Student marks is :" + marks);
		else
			System.out.println("Student does not exist with Roll :" + roll);

	}

}
