package com.masai.dao;

import java.util.List;

import com.masai.exception.CourseException;
import com.masai.model.StudentCourseDTO;

public interface CourseDao {

	
	public List<StudentCourseDTO> getAllStudentsByCourseName(String cname)throws CourseException;
	
}
