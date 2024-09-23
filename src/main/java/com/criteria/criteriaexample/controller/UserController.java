package com.criteria.criteriaexample.controller;

import com.criteria.criteriaexample.service.UserService;
import com.criteria.criteriaexample.vo.UserOrderVO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {

  private final UserService userService;

  @GetMapping("/users/orders")
  @ResponseBody
  public List<UserOrderVO> getUserWithOrders() {
    return userService.getUserWithOrders();
  }

}
