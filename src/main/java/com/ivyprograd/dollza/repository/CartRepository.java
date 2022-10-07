package com.ivyprograd.dollza.repository;

import com.ivyprograd.dollza.models.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart,String> {

}
