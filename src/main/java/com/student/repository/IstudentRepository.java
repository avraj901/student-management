package com.student.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.entity.Student;

public interface IstudentRepository extends JpaRepository<Student, Integer>{

	List<Student> findByClassName(Integer id);

}
