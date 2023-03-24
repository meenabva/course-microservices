package com.cg.springboot.microservices.service;

import java.util.List;

import com.cg.springboot.microservices.model.User;

public interface UserService {

	User save(User user);

	User findByUsername(String username);

	List<String> findUsers(List<Long> idList);

}
