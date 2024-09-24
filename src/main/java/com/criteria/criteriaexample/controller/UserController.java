package com.criteria.criteriaexample.controller;

import com.criteria.criteriaexample.model.User;
import com.criteria.criteriaexample.service.UserService;
import com.criteria.criteriaexample.vo.UserOrderVO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

  @PostMapping("/register")
  @ResponseBody
  public ResponseEntity<String> registerUser(@RequestBody User user) {
    try {
      userService.registerUser(user);
      return ResponseEntity.ok("회원가입완료");
    } catch (Exception e){
      return ResponseEntity.badRequest().body(e.getMessage());
    }
  }

}
