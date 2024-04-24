package com.example.examletest.Dao;

import com.example.examletest.aop.LoggingDao;
import com.example.examletest.model.User;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.lang.reflect.Method;

@Repository
@Component
public class CalculatorDaoImp {

    @Autowired
    private CalculatorDao calculatorDao;

    @Autowired
    private LoggingDao loggingDao;

    public CalculatorDaoImp() {
    }

    public CalculatorDaoImp(CalculatorDao calculatorDao, LoggingDao loggingDao) {
        this.calculatorDao = calculatorDao;
    }

    @Transactional
    public void addUser(User user) throws NoSuchMethodException {
        //calculatorDao.save(user);
        Method method = loggingDao.getClass().getMethod("logBefore");
        System.out.println(method);
    }
}
