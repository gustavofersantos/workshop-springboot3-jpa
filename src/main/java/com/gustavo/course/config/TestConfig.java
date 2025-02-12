package com.gustavo.course.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.gustavo.course.entities.Order;
import com.gustavo.course.entities.User;
import com.gustavo.course.repositories.OrderRepository;
import com.gustavo.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Roberto Peixoto", "roberto@gmail.com", "11999999999", "123456");
		User u2 = new User(null, "Katarina Silva", "katarina@gmail.com", "11988888888", "123456");
		
		Order o1 = new Order(null, Instant.parse("2025-02-12T15:43:02Z"), u1); 
		Order o2 = new Order(null, Instant.parse("2025-02-12T03:22:10Z"), u2); 
		Order o3 = new Order(null, Instant.parse("2025-02-12T15:08:52Z"), u1); 

		
		userRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
	}
}
