package com.example.examletest.aop;

import com.example.examletest.Dao.CalculatorDao;
import com.example.examletest.Dao.CalculatorDaoImp;
import com.example.examletest.model.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class LoggingDaoTest {

    @Mock
    CalculatorDao calculatorDao;

    @Mock
    LoggingDao loggingDao;

    @InjectMocks
    CalculatorDaoImp calculatorDaoImp;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void logBeforeAddUser() {
        LoggingDao loggingDao1 = mock(LoggingDao.class);
        Class<LoggingDao> clazz = (Class<LoggingDao>) loggingDao1.getClass();
        System.out.println(clazz);
        User user = new User();
        user.setName("Test");
        user.setLastName("Test");
        calculatorDaoImp.addUser(user);
        verify(loggingDao).logBefore();
    }

}
