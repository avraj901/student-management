package com.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.entity.Student;
import com.student.service.IStudentService;

@RestController
public class StudentController {

	@Autowired
	IStudentService studentService;
	
	@PostMapping("/student")
	public Integer createStudent(@RequestBody Student student) {
		Integer id = studentService.saveStudent(student);
		return id;
	}
}
