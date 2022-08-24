package com.student.service;

import java.util.List;
import java.util.Optional;

import com.student.entity.Student;

public interface IStudentService {

	Integer saveStudent(Student student);
	
	public List<Student> getAllStudent();
	
	Optional<Student> getStudent(Integer id);
}
