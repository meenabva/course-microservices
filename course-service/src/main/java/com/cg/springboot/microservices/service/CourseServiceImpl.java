package com.cg.springboot.microservices.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.springboot.microservices.model.Course;
import com.cg.springboot.microservices.model.Transaction;
import com.cg.springboot.microservices.repository.CourseRepository;
import com.cg.springboot.microservices.repository.TransactionRepository;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseRepository courseRepository;
	
	@Autowired
	private TransactionRepository transactionRepository;
	
	@Override
	public List<Course> allCourses(){
		return courseRepository.findAll();
	}
	
	@Override
	public Course findCourseById(Long courseId) {
		return courseRepository.findById(courseId).orElse(null);
	}
	
	@Override
    public List<Transaction> findTransactionsOfUser(Long userId) {
        return transactionRepository.findAllByUserId(userId);
    }

    @Override
    public List<Transaction> findTransactionsOfCourse(Long courseId) {
        return transactionRepository.findAllByCourseId(courseId);
    }

    @Override
    public Transaction saveTransaction(Transaction transaction) {
        return transactionRepository.save(transaction);
    }
}
