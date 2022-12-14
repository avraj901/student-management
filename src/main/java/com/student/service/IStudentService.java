package com.student.service;

import java.util.List;
import java.util.Optional;

import com.student.entity.Student;

public interface IStudentService {

	Integer saveStudent(Student student);

	public List<Student> getAllStudent();

	Optional<Student> getStudentById(Integer studentId);

	public void deleteStudent(Integer studentId);

	Student updateStudent(Student student, Integer id);
	
	List<Student> getStudentByClass(Integer studentId);
	
	
}
