package com.bicjo.boot;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.bicjo.boot.model.User;
import com.bicjo.boot.repository.UserRepository;

@SpringBootApplication
public class Application {

	private static final Logger LOG = LoggerFactory.getLogger(Application.class);
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class);
	}
	
	@Bean
	public CommandLineRunner initModel(UserRepository userRepository) {
		
		return (args) -> {
			List<User> users = new ArrayList<User>(){
				private static final long serialVersionUID = 3235589211981968698L;
			{
				add(new User("Joven"));
				add(new User("Rose"));
				add(new User("Chance"));
			}};
			userRepository.save(users);
			
			LOG.info(users.toString());
		};

	}

}
