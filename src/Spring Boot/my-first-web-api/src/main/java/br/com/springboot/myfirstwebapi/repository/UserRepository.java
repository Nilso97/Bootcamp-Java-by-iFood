package br.com.springboot.myfirstwebapi.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.springboot.myfirstwebapi.handler.RequiredException;
import br.com.springboot.myfirstwebapi.model.User;

@Repository
public class UserRepository {
    
    public void save(User user) {
        if (user.getLogin() == null) {
            throw new RequiredException("login");
        }

        if (user.getPassword() == null) {
            throw new RequiredException("password");
        }

        if (user.getId() == null) {
            System.out.println("SAVE - Recebendo o usuário na camada de repositório");
        } else {
            System.out.println("UPDATE - Recebendo o usuário na camada de repositório");
        }

        System.out.println(user);
    }

    public void update(User user) {
        System.out.println("UPDATE - Recebendo o usuário na camada de repositório");
        System.out.println(user);
    }

    public void remove(Integer id) {
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuário", id));
        System.out.println(id);
    }

    public List<User> listAll() {
        System.out.println("LIST - Listando os usários do sistema");
        List<User> users = new ArrayList<>();
        users.add(new User("john.doe", "******"));
        users.add(new User("frank.zappa", "******"));
        return users;
    }

    public User findById(Integer id) {
        System.out.println(String.format("FIND/id - Recebendo o id: %d para localizar um usuário", id));
        return new User("john.doe", "******");
    }
}
