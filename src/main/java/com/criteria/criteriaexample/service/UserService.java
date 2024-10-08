package com.criteria.criteriaexample.service;

import com.criteria.criteriaexample.model.Order;
import com.criteria.criteriaexample.model.Product;
import com.criteria.criteriaexample.model.User;
import com.criteria.criteriaexample.repository.UserRepository;
import com.criteria.criteriaexample.vo.UserOrderVO;
import jakarta.persistence.EntityManager;
import jakarta.persistence.criteria.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

  private final EntityManager entityManager;
  private final UserRepository userRepository;

  @Transactional
  public User registerUser(User user){
    if(userRepository.existsByEmail(user.getEmail())){
      throw new IllegalArgumentException("이미 사용 중인 이메일입니다.");
    }

    return userRepository.save(user);
  }

  public List<UserOrderVO> getUserWithOrders() {
    CriteriaBuilder cb = entityManager.getCriteriaBuilder();
    CriteriaQuery<UserOrderVO> query = cb.createQuery(UserOrderVO.class);

    Root<User> user = query.from(User.class);
    Join<User, Order> order = user.join("orders", JoinType.LEFT);
    Join<Order, Product> product = order.join("product", JoinType.LEFT);

    query.select(cb.construct(
      UserOrderVO.class,
      order.get("id"),
      user.get("username"),
      product.get("name"),
      product.get("description"),
      order.get("total")
    ));

    query.orderBy(cb.asc(order.get("id")));

    return entityManager.createQuery(query).getResultList();
  }

}
