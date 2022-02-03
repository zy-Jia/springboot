package com.gyofu.jpa.repository;

import com.gyofu.jpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaUserRepository extends JpaRepository<User, Integer> {
    public User findByUserName(String username);
}
