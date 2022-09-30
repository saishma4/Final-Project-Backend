package com.ivyprograd.dollza.repository;


import com.ivyprograd.dollza.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}

