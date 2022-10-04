package com.ivyprograd.dollza.models;

import lombok.Data;

import javax.persistence.*;
import java.awt.*;

@Data
@Entity
@Table
public class Dolls {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String dollname;
    private int price;

    private String description;

    private String dollImage;


    public Dolls( String dollname,int price,String description, String dollImage){
        this.dollname=dollname;
        this.description=description;
        this.price=price;
        this.dollImage=dollImage;
    }
    public Dolls() {
        super();
    }
}

