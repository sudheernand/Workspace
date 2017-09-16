package com.indus.training.spring.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import com.indus.training.service.Calculator;

@Aspect
public class CalculatorAspectPointcut {

	public static Logger logger = LoggerFactory.getLogger(Calculator.class);

	@Pointcut("within(com.indus.training.service.*)")
	public void allMethodsPointCut() {
System.out.println("inside pc");
	}

	@Before("allMethodsPointCut()")
	public void allServiceMethodsAdvice() {
		System.out.println("Before executing service method");

	}

	@Before("execution( * add(*))")
	public void logBefore(JoinPoint joinP) {
		logger.info("method is about to execute " + joinP.getSignature().getName());
		System.out.println("Executing loggingAdvice");
	}

}
