package com.masai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.masai.exception.CourseException;
import com.masai.model.StudentCourseDTO;
import com.masai.utiltiy.DBUtil;

public class CourseDaoImpl implements CourseDao{

	@Override
	public List<StudentCourseDTO> getAllStudentsByCourseName(String cname) throws CourseException {
		
		
		List<StudentCourseDTO> dtos = new ArrayList<>();
		
		
		try (Connection conn= DBUtil.provideConnection()){
			
			
			
			PreparedStatement ps= conn.prepareStatement("select s.roll, s.name,s.address, s.email, c.cname, c.fee, c.duration "
					+ "from student s INNER JOIN course c INNER JOIN student_course sc "
					+ "ON s.roll = sc.roll AND c.cid = sc.cid AND c.cname = ?");
			
			
			ps.setString(1, cname);
			
			ResultSet rs= ps.executeQuery();
			
			while(rs.next()) {
				
				
				
			}
			
			
			
			
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new CourseException(e.getMessage());
		}
		
		
		
		
		
		
		
		return dtos;
		
	}

}
