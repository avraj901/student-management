package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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

	@GetMapping("/allstudent")
	public List<Student> getAllStudent() {
		return studentService.getAllStudent();
	}
}
