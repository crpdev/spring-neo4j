package com.crpdev.spring.neo4j.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import com.crpdev.spring.neo4j.entity.Student;

@Repository
public interface StudentRepository extends Neo4jRepository<Student, Long>{

}
