package com.ivyprograd.dollza.contollers;

import com.ivyprograd.dollza.models.Cart;
import com.ivyprograd.dollza.models.Payment;
import com.ivyprograd.dollza.services.CartService;
import com.ivyprograd.dollza.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/auth/")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;
    @GetMapping("/paymentList")
    public List<Payment> list() {
        return paymentService.getPaymentList();
    }

    @PostMapping("/add_payment")
    public Payment addToPayment(@RequestBody Payment entry){
        return paymentService.addToPayment(entry);
    }
}
