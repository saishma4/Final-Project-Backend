package com.ivyprograd.dollza.contollers;

import com.ivyprograd.dollza.models.Cart;
import com.ivyprograd.dollza.models.Dolls;
import com.ivyprograd.dollza.services.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/auth/")
public class CartController {
    @Autowired
    private CartService cartService;
    @GetMapping("/cart")
    public List<Cart> list() {
        return cartService.getProductsList();
    }
    @PostMapping("/add_doll")
    public Cart addDoll(@RequestBody Cart entry){
        return cartService.addToCart(entry);
    }

}
