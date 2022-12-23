package com.masai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.masai.model.Student;
import com.masai.utiltiy.DBUtil;

public class StudentDaoImpl implements StudentDao{

	@Override
	public String insertStudentDetails(int roll, String name, String address, int marks) {
		
		String message = "Not Inserted..!";
		
		
		try (Connection conn= DBUtil.provideConnection()) {
			
			
			PreparedStatement ps= conn.prepareStatement("insert into student values(?,?,?,?)");
			
			ps.setInt(1, roll);
			ps.setString(2, name);
			ps.setString(3, address);
			ps.setInt(4, marks);
			
			
			int x= ps.executeUpdate();
			
			if(x > 0)
				message = "Record Inserted Sucessfully..!";
			
			
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			message = e.getMessage();
		}
			
		return message;
		
	}

	@Override
	public String insertStudentDetails2(Student student) {
		
		String message = "Not Inserted..!";
		
		
		try (Connection conn= DBUtil.provideConnection()) {
			
			
			PreparedStatement ps= conn.prepareStatement("insert into student values(?,?,?,?)");
			
			ps.setInt(1, student.getRoll());
			ps.setString(2, student.getName());
			ps.setString(3, student.getAddress());
			ps.setInt(4, student.getMarks());
			
			
			int x= ps.executeUpdate();
			
			if(x > 0)
				message = "Record Inserted Sucessfully..!";
			
			
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			message = e.getMessage();
		}
			
		return message;
		
		
	}

	
	
	
	
	
	@Override
	public int getStudentMarksByRoll(int roll) {
	
		int marks = -1;
		
		
		try (Connection conn= DBUtil.provideConnection()){
			
			PreparedStatement ps= conn.prepareStatement("select marks from student where roll =?");
			
			ps.setInt(1, roll);
			
			ResultSet rs= ps.executeQuery();
			
			if(rs.next())
				marks= rs.getInt("marks");
			
		
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return marks;
	}

	@Override
	public Student getStudentDetailsByRoll(int roll) {
		
		Student student = null;
		
		try(Connection conn= DBUtil.provideConnection()) {
			
			
			PreparedStatement ps= conn.prepareStatement("select * from student where roll = ?");
			
			ps.setInt(1, roll);
			
			ResultSet rs= ps.executeQuery();
			
			if(rs.next()) {
				
				int r= rs.getInt("roll");
				String n= rs.getString("name");
				String a= rs.getString("address");
				int m= rs.getInt("marks");
				
			    student = new Student();
				student.setRoll(r);
				student.setName(n);
				student.setAddress(a);
				student.setMarks(m);
				
				
				
			}
			
			
			
			
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
		return student;
		
	}

	@Override
	public List<Student> getAllStudentDetails() {
		
		List<Student> students = new ArrayList<>();
		
		
		
		
		
		
		
		
		return students;
		
	}
	
	
	
	
	
	

}
