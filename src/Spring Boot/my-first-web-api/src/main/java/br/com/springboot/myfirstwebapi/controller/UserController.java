package br.com.springboot.myfirstwebapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.springboot.myfirstwebapi.model.User;
import br.com.springboot.myfirstwebapi.repository.UserRepository;

@RestController
@RequestMapping("/users")
public class UserController {
    
    @Autowired
    UserRepository userRepository;

    @PostMapping
    public void addUser(@RequestBody User user) {
        userRepository.save(user);
    }

    @GetMapping
    public List<User> getUsers() {
        return userRepository.listAll();
    }

    @GetMapping("/{id}")
    public User findById(@PathVariable("id") Integer id) {
        return userRepository.findById(id);
    }

    @PutMapping("/{id}")
    public void updateUser(@RequestBody User user) {
        userRepository.update(user);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") Integer id) {
        userRepository.remove(id);
    }
}
