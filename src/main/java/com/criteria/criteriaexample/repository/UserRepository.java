package com.criteria.criteriaexample.repository;

import com.criteria.criteriaexample.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
  /**
   * existsBy : 데이터베이스에 존재하는지 체크
   * 예) boolean existsByEmail(String email); // 이메일이 데이터베이스에 이미 존재하는지 확인
   */

  /**
   * findBy : 특정 조건을 만족하는 엔티티(혹은 엔티티의 리스트)를 조회할 때 사용
   * 예) List<User> findByUsername(String username);  // username으로 User 리스트를 조회
   */

  /**
   * countBy : 특정 조건을 만족하는 엔티티의 수를 반환
   * 예) long countByEmail(String email); // 특정 이메일을 가진 사용자의 수를 반환
   */

  /**
   * deleteBy : 특정 조건을 만족하는 엔티티를 삭제
   * 예) void deleteByUsername(String username); // username으로 사용자 삭제
   */

  /**
   * readBy : findBy와 동일하게 작동하며, 데이터를 읽어올 때 사용
   * 예) User readByEmail(String email); // 특정 이메일을 가진 사용자를 조회
   */

  /**
   * getBy : findBy와 유사하며, 주로 단일 결과를 기대할 때 사용
   * 예) User getByUsername(String username); // 특정 username을 가진 사용자 조회
   */

  /**
   * Between: 범위 내의 값을 검색
   * 예) List<Order> findByTotalBetween(Double min, Double max); // total 값이 min과 max 사이인 주문 찾기
   */

  /**
   * LessThan, LessThanEqual: 특정 값보다 작은 경우
   * 예) List<Product> findByPriceLessThan(Double price); // price가 특정 값보다 작은 상품 찾기
   */

  /**
   * GreaterThan, GreaterThanEqual: 특정 값보다 큰 경우
   * 예) List<Product> findByPriceGreaterThanEqual(Double price); // price가 특정 값 이상인 상품 찾기
   */

  /**
   * Like: 특정 패턴과 일치하는 값을 찾을 때 사용
   * 예) List<User> findByUsernameLike(String pattern); // username이 특정 패턴과 일치하는 사용자 찾기
   */

  /**
   * IsNull / IsNotNull: 필드가 NULL인지 또는 NULL이 아닌지 검사
   * 예) List<Order> findByTotalIsNull(); // total이 NULL인 주문 찾기
   */

  /**
   * OrderBy 키워드를 사용하여 정렬할 수 있습니다.
   * 예) List<User> findByEmailOrderByUsernameAsc(String email); // email로 조회된 결과를 username 오름차순 정렬
   */

  boolean existsByEmail(String email);

}
