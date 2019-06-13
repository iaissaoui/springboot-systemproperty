package com.mycompany.spring.boot.java.basic.archetype.service;

import com.mycompany.spring.boot.java.basic.archetype.entity.User;
import com.mycompany.spring.boot.java.basic.archetype.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getUserById(Long id) {
        return userRepository.getById(id);
    }
}
