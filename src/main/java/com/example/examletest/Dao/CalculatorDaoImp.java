package com.example.examletest.Dao;

import com.example.examletest.aop.LoggingDao;
import com.example.examletest.model.User;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public class CalculatorDaoImp {

    @Autowired
    private CalculatorDao calculatorDao;

    public CalculatorDaoImp(CalculatorDao calculatorDao, LoggingDao loggingDao) {
        this.calculatorDao = calculatorDao;
    }

    @Transactional
    public void addUser(User user) {
        calculatorDao.save(user);
    }
}
