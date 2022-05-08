package com.crpdev.spring.neo4j.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crpdev.spring.neo4j.entity.Student;
import com.crpdev.spring.neo4j.request.CreateStudentRequest;
import com.crpdev.spring.neo4j.service.StudentService;

@RestController
@RequestMapping("/api/student/")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@PostMapping("/create")
	public Student createStudent(@RequestBody CreateStudentRequest createStudentRequest) {
		return studentService.createStudent(createStudentRequest);
	}

}
