package com.gyofu.controller.mybatis;

import com.gyofu.entity.User;
import com.gyofu.mybatis.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserHandler {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/findAll")
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @GetMapping("/findById/{id}")
    public User findById(@PathVariable("id") Integer id) {
        return userRepository.findById(id);
    }

    @PostMapping("/save")
    public int save(@RequestBody User user) {
        return userRepository.save(user);
    }

    @PutMapping("/update")
    public int update(@RequestBody User user) {
        return userRepository.update(user);
    }

    @DeleteMapping("/deleteById/{id}")
    public int deleteById(@PathVariable("id") Integer id) {
        return userRepository.deleteById(id);
    }
}
