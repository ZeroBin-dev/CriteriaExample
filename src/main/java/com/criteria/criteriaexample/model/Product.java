package com.criteria.criteriaexample.model;

import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class Product {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;
  private String description;
  private Double price;
  private Integer stock;
  private String createdAt;
}
