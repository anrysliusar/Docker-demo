package com.example.dockerdemo.dao;

import com.example.dockerdemo.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAO extends JpaRepository<User, Integer> {
}
