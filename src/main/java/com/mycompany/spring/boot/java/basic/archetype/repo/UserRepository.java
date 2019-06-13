package com.mycompany.spring.boot.java.basic.archetype.repo;

import com.mycompany.spring.boot.java.basic.archetype.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    public User getById(Long id) {
        return new User();
    }
}
