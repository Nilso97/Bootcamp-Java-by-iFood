package br.com.springboot.springdatajpa.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import br.com.springboot.springdatajpa.model.User;
import br.com.springboot.springdatajpa.repository.UserRepository;

@Component
public class StartApp implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        List<User> users = userRepository.findByNameContaining("John");
        for (User u : users) {
            System.out.println(u);
        }
    }

    private void insertUser() {
        User user = new User();
        user.setName("Suzan Michael");
        user.setUsername("suzan.michael");
        user.setPassword("******");
        userRepository.save(user);

        for (User u : userRepository.findAll()) {
            System.out.println(u);
        }
    }
}
