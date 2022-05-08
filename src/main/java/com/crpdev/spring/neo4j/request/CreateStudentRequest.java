package com.crpdev.spring.neo4j.request;

import java.util.List;

public class CreateStudentRequest {

	private String name;
	private Integer birthYear;
	private String country;

	private List<CreateSubjectRequest> subjects;
	private CreateDepartmentRequest department;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(Integer birthYear) {
		this.birthYear = birthYear;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public List<CreateSubjectRequest> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<CreateSubjectRequest> subjects) {
		this.subjects = subjects;
	}

	public CreateDepartmentRequest getDepartment() {
		return department;
	}

	public void setDepartment(CreateDepartmentRequest department) {
		this.department = department;
	}

}
