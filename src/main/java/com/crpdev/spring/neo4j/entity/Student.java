package com.crpdev.spring.neo4j.entity;

import java.util.List;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;
import org.springframework.data.neo4j.core.schema.Relationship;
import org.springframework.data.neo4j.core.schema.Relationship.Direction;

@Node(labels = { "Student" })
public class Student {

	@Id
	@GeneratedValue
	private Long id;

	@Property(name = "name")
	private String name;

	@Property(name = "country")
	private String country;

	@Property(name = "birth_year")
	private Integer birthYear;

	@Relationship(type = "BELONGS_TO", direction = Direction.OUTGOING)
	private Department department;

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<IsLearningRelation> getIsLearningRelations() {
		return isLearningRelations;
	}

	public void setIsLearningRelations(List<IsLearningRelation> isLearningRelations) {
		this.isLearningRelations = isLearningRelations;
	}

	@Relationship(type = "IS_LEARNING", direction = Direction.OUTGOING)
	private List<IsLearningRelation> isLearningRelations;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Integer getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(Integer birthYear) {
		this.birthYear = birthYear;
	}

}
