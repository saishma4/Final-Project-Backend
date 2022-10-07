package com.ivyprograd.dollza.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long mobileNum;
    @Column(unique = true)
    private Long cardNum;
    private String expiryDate;
    private int cvv;
    private String cardHolderName;


    public Payment(Long mobileNum,Long cardNum,String expiryDate,int cvv,String cardHolderName) {
        this.mobileNum=mobileNum;
        this.cardNum=cardNum;
        this.expiryDate=expiryDate;
        this.cvv=cvv;
        this.cardHolderName=cardHolderName;
    }

    public Payment() {
        super();
    }
}
