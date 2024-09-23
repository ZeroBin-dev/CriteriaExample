package com.criteria.criteriaexample.repository;

import com.criteria.criteriaexample.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
