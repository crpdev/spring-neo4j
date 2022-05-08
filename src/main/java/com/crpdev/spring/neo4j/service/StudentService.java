package com.crpdev.spring.neo4j.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crpdev.spring.neo4j.entity.Department;
import com.crpdev.spring.neo4j.entity.IsLearningRelation;
import com.crpdev.spring.neo4j.entity.Student;
import com.crpdev.spring.neo4j.entity.Subject;
import com.crpdev.spring.neo4j.repository.DepartmentRepository;
import com.crpdev.spring.neo4j.repository.StudentRepository;
import com.crpdev.spring.neo4j.repository.SubjectRepository;
import com.crpdev.spring.neo4j.request.CreateStudentRequest;
import com.crpdev.spring.neo4j.request.CreateSubjectRequest;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository studentRepository;
	
	@Autowired
	DepartmentRepository departmentRepository;
	
	@Autowired
	SubjectRepository subjectRepository;

	public Student createStudent(CreateStudentRequest createStudentRequest) {
		Department department = new Department();
		department.setName(createStudentRequest.getDepartment().getName());
		departmentRepository.save(department);
		
		List<IsLearningRelation> isLearningRelations = new ArrayList<>();
		
		if (createStudentRequest.getSubjects() != null) {
			for (CreateSubjectRequest createsub: createStudentRequest.getSubjects()) {
				Subject subject = new Subject();
				subject.setName(createsub.getName());
				subjectRepository.save(subject);
				IsLearningRelation relation = new IsLearningRelation();
				relation.setMarks(createsub.getMarks());
				relation.setSubject(subject);
				isLearningRelations.add(relation);
			}
		}
		
		Student student = new Student();
		student.setName(createStudentRequest.getName());
		student.setCountry(createStudentRequest.getCountry());
		student.setBirthYear(createStudentRequest.getBirthYear());
		student.setDepartment(department);
		student.setIsLearningRelations(isLearningRelations);
		studentRepository.save(student);
		return student;
	}

}
