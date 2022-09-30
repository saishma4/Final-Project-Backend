package com.ivyprograd.dollza.models;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "userTable")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String username;
    @Column(unique = true)
    private String email;
    private String password;
    private String confirmpassword;


    public User(String username, String email, String password, String confirmpassword) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.confirmpassword = confirmpassword;


    }

    public User() {
        super();
    }
}