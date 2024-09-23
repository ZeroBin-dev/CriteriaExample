package com.criteria.criteriaexample.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserOrderVO {
  private Long orderId;
  private String userName;
  private String productName;
  private String productDesc;
  private Double total;
}
