package com.gyofu.controller;

import com.gyofu.entity.User;
import com.gyofu.repository.impl.UserRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController(value = "myhandler")
@RequestMapping("/myuser")
public class UserHandler {
    @Autowired
    private UserRepositoryImpl userRepository;

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
