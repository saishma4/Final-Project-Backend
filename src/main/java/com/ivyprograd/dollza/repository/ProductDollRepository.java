package com.ivyprograd.dollza.repository;

import com.ivyprograd.dollza.models.Dolls;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductDollRepository extends JpaRepository<Dolls,String> {
    Optional<Dolls> findByDollname(String dollname);
}
