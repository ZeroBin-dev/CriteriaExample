package com.criteria.criteriaexample.config;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
public class LogAop {

  @Before("execution(* com.criteria..*(..))")
  public void methodCall(JoinPoint joinPoint) {
    String methodName = joinPoint.getSignature().getName();
    String className = joinPoint.getSignature().getDeclaringTypeName();
    log.info("Entering method: " + className + "." + methodName + "()");
  }

  @AfterReturning(pointcut = "execution(* com.criteria..*(..))", returning = "result")
  public void logMethodExit(JoinPoint joinPoint, Object result) {
    String methodName = joinPoint.getSignature().getName();
    String className = joinPoint.getSignature().getDeclaringTypeName();
    log.info("Exiting method: " + className + "." + methodName + "() with result: " + result);
  }

}
