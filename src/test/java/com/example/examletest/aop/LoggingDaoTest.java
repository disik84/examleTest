package com.example.examletest.aop;

import com.example.examletest.Dao.CalculatorDao;
import com.example.examletest.Dao.CalculatorDaoImp;
import com.example.examletest.model.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import java.lang.reflect.InvocationTargetException;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class LoggingDaoTest {

    @Spy
    CalculatorDao calculatorDao;

    @Spy
    LoggingDao loggingDao;

    @InjectMocks
    CalculatorDaoImp calculatorDaoImp;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void logBeforeAddUser() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException
            , InstantiationException {

        User user = new User();
        user.setName("test");
        user.setLastName("test");

        calculatorDaoImp.addUser(user);

        verify(loggingDao).logBefore();

    }

}