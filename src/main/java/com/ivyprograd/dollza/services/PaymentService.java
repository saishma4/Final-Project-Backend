package com.ivyprograd.dollza.services;


import com.ivyprograd.dollza.models.Payment;

import com.ivyprograd.dollza.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService {
    @Autowired
    private PaymentRepository paymentRepository;

    public PaymentService(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    public List<Payment> getPaymentList() {
        return paymentRepository.findAll();}

    public Payment addToPayment(Payment entry) {
        return paymentRepository.save(entry);
    }
}
