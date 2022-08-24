package com.student.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.entity.Student;
import com.student.repository.IstudentRepository;

@Service
public class StudentServiceImpl implements IStudentService {

	@Autowired
	IstudentRepository studentRepository;

	@Override
	public Integer saveStudent(Student student) {
		Student saveStudent = studentRepository.save(student);
		return saveStudent.getId();
	}

}
