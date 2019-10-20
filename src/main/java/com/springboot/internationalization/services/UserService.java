package com.springboot.internationalization.services;

import com.springboot.internationalization.entities.User;
import com.springboot.internationalization.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Description;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@Description("User service component")
public class UserService {

    @Autowired
    private UserRepository userRepository;


    /**
     * Method for storing new user
     *
     * @param user given user reference
     * @return stored User Object
     */
    public User store(User user) {
        return userRepository.save(user);
    }
}
