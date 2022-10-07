package com.ivyprograd.dollza.services;

import com.ivyprograd.dollza.models.Dolls;
import com.ivyprograd.dollza.repository.ProductDollRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductDollService {
    @Autowired
    private ProductDollRepository productDollRepository;

    public ProductDollService(ProductDollRepository productDollRepository) {
        this.productDollRepository = productDollRepository;
    }

    public List<Dolls> getDollsList() {
        return productDollRepository.findAll();
    }
}
