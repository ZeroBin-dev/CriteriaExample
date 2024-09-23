package com.criteria.criteriaexample.repository;

import com.criteria.criteriaexample.model.Order;
import com.criteria.criteriaexample.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
