package com.criteria.criteriaexample.repository;

import com.criteria.criteriaexample.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
