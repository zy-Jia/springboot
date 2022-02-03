package com.gyofu.controller.jpa;

import com.gyofu.jpa.entity.User;
import com.gyofu.jpa.repository.JpaUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/jpaHandler")
@RequestMapping("/jpauser")
public class UserHandler {

    @Autowired
    private JpaUserRepository userRepository;

    @GetMapping("/findAll")
    public List<User> findAll(){
        return userRepository.findAll();
    }

    @GetMapping("/findById/{id}")
    public User findById(@PathVariable("id") Integer id){
        return userRepository.findById(id).get();
    }

    @PostMapping("/save")
    public void save(@RequestBody User user){
        userRepository.save(user);
    }

    @PutMapping("/update")
    public void update(@RequestBody User user){
        userRepository.save(user);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") Integer id){
        userRepository.deleteById(id);
    }

    @GetMapping("/findByUserName/{username}")
    public User findByUserName(@PathVariable("username") String username){
        return userRepository.findByUserName(username);
    }
}
