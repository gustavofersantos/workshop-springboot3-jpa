package com.gustavo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gustavo.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
