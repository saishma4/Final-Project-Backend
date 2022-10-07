package com.ivyprograd.dollza.repository;

import com.ivyprograd.dollza.models.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment,Long> {

}
