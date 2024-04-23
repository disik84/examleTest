package com.example.examletest.controller;

import com.example.examletest.Dao.CalculatorDaoImp;
import com.example.examletest.model.User;
import com.example.examletest.util.Calculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@RestController
public class CalculatorController {

    @Autowired
    CalculatorDaoImp calculatorDaoImp;

    @GetMapping("test")
    public User testContr() throws NoSuchMethodException, InstantiationException, IllegalAccessException
            , InvocationTargetException {
        User user = new User();
        user.setName("test");
        user.setLastName("test");
        calculatorDaoImp.addUser(user);

        Class clazz = CalculatorDaoImp.class;
        Method method = clazz.getMethod("addUser", User.class);
        Object obj = clazz.newInstance();
        String str = (String) method.invoke(obj, user);
        System.out.println(str);
        return user;
    }

}
