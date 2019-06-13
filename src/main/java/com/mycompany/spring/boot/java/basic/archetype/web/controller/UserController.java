package com.mycompany.spring.boot.java.basic.archetype.web.controller;

import com.mycompany.spring.boot.java.basic.archetype.entity.User;
import com.mycompany.spring.boot.java.basic.archetype.service.UserService;
import java.awt.PageAttributes;
import javax.activation.MimeType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@Slf4j
public class UserController {

    private final UserService userService;
    
    
    
    @Value("${myproperty}")
    private String myProperty; 

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }
    
    @GetMapping(path = "/property",  produces = MediaType.TEXT_PLAIN_VALUE )
    @ResponseBody
    public String getProperty( ){
        
        
        
        return myProperty;
    }

    @GetMapping("/users/{id}")
    public User getUser(@PathVariable Long id) {
        log.info("process=get-user, user_id={}", id);
        User user = userService.getUserById(id);
        return user;
    }
}
