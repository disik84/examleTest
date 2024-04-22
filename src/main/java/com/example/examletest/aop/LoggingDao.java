package com.example.examletest.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@Aspect
public class LoggingDao {

    @Pointcut("execution(* com.example.examletest.Dao.*.*(..))")
    public void callTest() {}

    @Before("callTest()")
    public void logBefore() {
        System.out.println("Starting logBefore");
    }

    @After("callTest()")
    public void logAfter() {
        System.out.println("Starting logAfter");
    }

}
