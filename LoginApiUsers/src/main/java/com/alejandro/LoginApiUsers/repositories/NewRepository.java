package com.alejandro.LoginApiUsers.repositories;

import com.alejandro.LoginApiUsers.entities.New;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface NewRepository extends com.alejandro.LoginApiUsers.repositories.Repository<NewRepository, Long> {
    Optional<New> findByNewTitleIgnoreCase(String newTitle);
}