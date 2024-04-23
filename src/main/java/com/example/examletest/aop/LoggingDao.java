package com.example.examletest.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@Aspect
public class LoggingDao {

    public boolean runOrNotRun = false;

    @Pointcut("execution(* com.example.examletest.Dao.*.*(..))")
    public void callTest() {}

    @Before("callTest()")
    public void logBefore() {
        System.out.println("Starting logBefore");
        runOrNotRun = true;
        System.out.println("runOrNotRun = " + runOrNotRun);
    }

    @After("callTest()")
    public void logAfter() {
        System.out.println("Starting logAfter");
    }

}
