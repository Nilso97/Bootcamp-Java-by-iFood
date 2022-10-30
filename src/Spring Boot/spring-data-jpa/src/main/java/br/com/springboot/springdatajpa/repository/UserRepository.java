package br.com.springboot.springdatajpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.springboot.springdatajpa.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    
    // @QueryMethod
    List<User> findByNameContaining(String name);

    // @QueryMethod
    User findByUsername(String username);

    // @QueryOverride
    @Query("SELECT u FROM User u WHERE u.name LIKE %:name%")
    List<User> findByName(String name);
}
