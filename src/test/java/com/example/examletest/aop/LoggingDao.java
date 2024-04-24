package com.example.examletest.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.stereotype.Component;

@Component
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