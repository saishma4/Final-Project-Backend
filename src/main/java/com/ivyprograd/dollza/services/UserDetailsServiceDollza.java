package com.ivyprograd.dollza.services;

import com.ivyprograd.dollza.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceDollza{
    @Autowired
    private UserRepository userRepository;
}