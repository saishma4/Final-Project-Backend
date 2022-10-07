package com.ivyprograd.dollza.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String dollname;
    private int price;


    public Cart() {
        super();
    }
}
