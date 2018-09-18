package com.nasim.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class EmpAspect {
	@Before("homeAdvice()")
	public void FirstAdvice() {
		System.out.println("Before Advise Aspect run");
	}

	@Before("homeAdvice()")
	public void secondAdvice() {
		System.out.println("Before Advise Aspect run");
	}
	@After("homeAdvice()")
	public void afterAdvice() {
		System.out.println("After Advise Aspect run");
	}

	@Pointcut("execution(public * get*(..))")
	public void homeAdvice() {

	}
}
