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
@Table(name = "soproduct", schema = "spr")
@Getter
@Setter
@Transactional
public class Soproduct implements Serializable {

    @Column(name = "SOPId", table = "soproduct", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long sOPId;

    @ManyToOne(targetEntity = So.class)
    private So so;

    @OneToMany(targetEntity = ProductItems.class, mappedBy = "soproduct", cascade = CascadeType.REMOVE)
    private List<ProductItems> productItemses;
}