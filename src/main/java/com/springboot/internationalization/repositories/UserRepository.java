package com.springboot.internationalization.repositories;

import com.springboot.internationalization.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> { }
