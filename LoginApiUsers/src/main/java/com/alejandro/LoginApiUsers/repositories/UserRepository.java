package com.alejandro.LoginApiUsers.repositories;

import com.alejandro.LoginApiUsers.entities.DefaultUser;

import java.util.Optional;

@org.springframework.stereotype.Repository
public interface UserRepository extends Repository<DefaultUser, Long>{
    Optional<DefaultUser> findByEmailIgnoreCase(String email);
}