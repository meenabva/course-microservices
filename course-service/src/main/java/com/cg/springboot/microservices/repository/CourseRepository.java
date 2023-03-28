package com.cg.springboot.microservices.repository;

import com.cg.springboot.microservices.model.Course;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long>{

}
