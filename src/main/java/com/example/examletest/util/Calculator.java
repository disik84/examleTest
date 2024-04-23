package com.example.examletest.util;

import com.example.examletest.aop.LoggingDao;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class Calculator {


    public int sum(int a, int b) {
        return a + b;
    }

}
