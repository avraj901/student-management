package com.student.service;

import java.util.List;

import com.student.entity.Student;

public interface IStudentService {

	Integer saveStudent(Student student);
	
	public List<Student> getAllStudent();
}
