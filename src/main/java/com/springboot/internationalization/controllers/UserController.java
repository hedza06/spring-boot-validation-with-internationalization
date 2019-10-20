package com.springboot.internationalization.controllers;

import com.springboot.internationalization.entities.User;
import com.springboot.internationalization.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Description;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/user")
@Description("Routing component for User entity")
public class UserController {

    @Autowired
    private UserService userService;


    /**
     * Storing new user | POST: /api/user
     *
     * @param user given request body
     * @return ResponseEntity with User Object and Http Status Code (201 | 400)
     */
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User> store(@Valid @RequestBody User user)
    {
        User createdUser = userService.store(user);
        return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
    }
}
