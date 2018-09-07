package com.spr.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Table(name = "card", schema = "spr")
public class Card implements Serializable {
    @Column(name = "CardId", table = "card", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long CardId;

    @Column(name = "Card_number", table = "card")
    @Basic
    private String cardnumber;

    @Column(name = "Cvc", table = "card")
    @Basic
    private String cvc;
    @Column(name = "CardHolder", table = "card")
    @Basic
    private String cardholder;

    @Column(name = "Expiration_date", table = "card")
    @Basic
    private String expiration_date;

    @Column(name="Sum",  table="card")
    @Basic
    private String sum;

    @Column(name="SOID",  table="card")
    @Basic
    private String soid;
}
