package com.crpdev.spring.neo4j.entity;

import org.springframework.data.neo4j.core.schema.RelationshipProperties;
import org.springframework.data.neo4j.core.schema.TargetNode;

@RelationshipProperties
public class IsLearningRelation {
	
	private Long marks;
	
	@TargetNode
	private Subject subject;

	public Long getMarks() {
		return marks;
	}

	public void setMarks(Long marks) {
		this.marks = marks;
	}
	
	

}
