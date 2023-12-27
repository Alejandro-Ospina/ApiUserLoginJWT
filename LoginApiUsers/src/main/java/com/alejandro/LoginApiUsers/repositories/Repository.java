package com.alejandro.LoginApiUsers.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface Repository<Entity, IdType> extends JpaRepository<Entity, IdType>{
}