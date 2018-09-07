/**
 * This file was generated by the JPA Modeler
 */
package com.spr.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * @author dzni0816
 */
@Entity
@Table(name = "paymentbill", schema = "spr")
@Getter
@Setter
@Transactional
public class Paymentbill implements Serializable {

    @Column(name = "PBId", table = "paymentbill", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long pBId;

    @Column(name = "CMP", table = "paymentbill", precision = 12)
    @Basic
    private Float cmp;

    @Column(name = "COTP", table = "paymentbill", precision = 12)
    @Basic
    private Float cotp;

    @Column(name = "CMPDisc", table = "paymentbill", precision = 12)
    @Basic
    private Float cMPDisc;

    @Column(name = "COTPDisc", table = "paymentbill", precision = 12)
    @Basic
    private Float cOTPDisc;

    @OneToMany(targetEntity = Payment.class, mappedBy = "paymentbill")
    private List<Payment> payments;
}