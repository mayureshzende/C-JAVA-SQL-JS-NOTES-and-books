package com.pga;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

// ASPECT- Non functional code
@Aspect
public class LoggingAspect {
	@Before("execution(* com.pga.StudentCRUD.*(..))")
	public void beforeMethod() {
	 System.out.println("Method execution begin");
	}
	 
	@After("execution(* com.pga.StudentCRUD.*(..))")
	public void afterMethod() {
	 System.out.println("Method has ended");
	}
}
