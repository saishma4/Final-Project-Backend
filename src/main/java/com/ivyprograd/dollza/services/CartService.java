package com.ivyprograd.dollza.services;

import com.ivyprograd.dollza.models.Cart;
import com.ivyprograd.dollza.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {
    @Autowired
    private CartRepository cartRepository;

    public CartService(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    public List<Cart> getProductsList() {
        return cartRepository.findAll();}

    public Cart addToCart(Cart entry) {
        return cartRepository.save(entry);
    }


}
