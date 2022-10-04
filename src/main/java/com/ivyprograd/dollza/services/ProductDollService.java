package com.ivyprograd.dollza.services;

import com.ivyprograd.dollza.models.Dolls;
import com.ivyprograd.dollza.models.User;
import com.ivyprograd.dollza.repository.ProductDollRepository;
import com.ivyprograd.dollza.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductDollService {
    @Autowired
    private ProductDollRepository productDollRepository;

    public List<Dolls> getDollsList() {
        return productDollRepository.findAll();
    }
}
