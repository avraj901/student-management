package com.student.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.entity.Student;
import com.student.exception.ResourceNotFoundException;
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

	@Override
	public List<Student> getAllStudent() {
		List<Student> student = studentRepository.findAll();
		return student;
	}

	@Override
	public Optional<Student> getStudent(Integer id) {
		return studentRepository.findById(id);
	}

	@Override
	public void deleteStudent(Integer id) {
		studentRepository.deleteById(id);
	}

	@Override
	public Student updateStudent(Student student, Integer id) {
		Student existingStudent = studentRepository.findById(id).orElseThrow(
				() -> new ResourceNotFoundException("Student", "id", id));
		existingStudent.setFirstName(student.getFirstName());
		existingStudent.setLastName(student.getLastName());
		existingStudent.setClassName(student.getClassName());
		existingStudent.setSubject(student.getSubject());
		existingStudent.setDateOfBirth(student.getDateOfBirth());
		
		//We will update the value and then save the updated value
		
		studentRepository.save(existingStudent);
		return existingStudent;
	}

}
