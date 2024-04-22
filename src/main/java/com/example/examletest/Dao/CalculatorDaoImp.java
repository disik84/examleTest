package com.example.examletest.Dao;

import com.example.examletest.aop.LoggingDao;
import com.example.examletest.model.User;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
public class CalculatorDaoImp {

    private CalculatorDao calculatorDao;

    private LoggingDao loggingDao;

    public CalculatorDaoImp(CalculatorDao calculatorDao, LoggingDao loggingDao) {
        this.calculatorDao = calculatorDao;
        this.loggingDao = loggingDao;
    }

    @Transactional
    public void addUser(User user) {
        calculatorDao.save(user);
    }
}
