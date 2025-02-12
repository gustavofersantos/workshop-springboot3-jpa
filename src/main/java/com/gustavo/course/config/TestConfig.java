package com.gustavo.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.gustavo.course.entities.User;
import com.gustavo.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Roberto Peixoto", "roberto@gmail.com", "11999999999", "123456");
		User u2 = new User(null, "Katarina Silva", "katarina@gmail.com", "11988888888", "123456");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
	}
}
