package com.bicjo.boot.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bicjo.boot.model.User;
import com.bicjo.boot.repository.UserRepository;

@RestController
@RequestMapping(produces = "application/json; charset=UTF-8")
public class HelloController {

	private final Logger LOG = LoggerFactory.getLogger(HelloController.class);
	
	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping("/")
	@ResponseBody
    public List<User> index() {
		
		List<User> users = (List<User>) userRepository.findAll();
		LOG.info(users.toString());
		
        return users;
    }
	
}
