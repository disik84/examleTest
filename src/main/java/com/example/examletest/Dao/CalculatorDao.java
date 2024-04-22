package com.example.examletest.Dao;

import com.example.examletest.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CalculatorDao extends JpaRepository<User, Long> {
}
