package com.gyofu.repository.impl;

import com.gyofu.entity.User;
import com.gyofu.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<User> findAll() {
        return jdbcTemplate.query(
                "select * from t_user",
                new BeanPropertyRowMapper<>(User.class)
        );
    }

    @Override
    public User findById(Integer id) {
        return jdbcTemplate.queryForObject(
                "select * from t_user where id = ?",
                new Object[]{id},
                new BeanPropertyRowMapper<>(User.class)
        );
    }

    @Override
    public int save(User user) {
        return jdbcTemplate.update(
                "insert into t_user(username, password, age) values (?, ?, ?)",
                user.getUsername(),
                user.getPassword(),
                user.getAge()
        );
    }

    @Override
    public int update(User user) {
        return jdbcTemplate.update(
                "update t_user set username = ?, password = ?, age = ? where id = ?",
                user.getUsername(),
                user.getPassword(),
                user.getAge(),
                user.getId()
        );
    }

    @Override
    public int deleteById(Integer id) {
        return jdbcTemplate.update(
                "delete from t_user where id = ?",
                id
        );
    }
}
