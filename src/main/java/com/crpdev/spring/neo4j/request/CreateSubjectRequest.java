package com.crpdev.spring.neo4j.request;

public class CreateSubjectRequest {

	private String name;
	private Long marks;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getMarks() {
		return marks;
	}

	public void setMarks(Long marks) {
		this.marks = marks;
	}

}
