package com.cg.springboot.microservices.service;

import java.util.List;

import com.cg.springboot.microservices.model.Course;
import com.cg.springboot.microservices.model.Transaction;

public interface CourseService {

	List<Course> allCourses();

    Course findCourseById(Long courseId);

    List<Transaction> findTransactionsOfUser(Long userId);

    List<Transaction> findTransactionsOfCourse(Long courseId);

    Transaction saveTransaction(Transaction transaction);
    
}
