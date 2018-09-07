package com.spr.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import javax.ws.rs.FormParam;
import java.io.Serializable;

/**
 * Created by Admin on 17.12.2016.
 */
@Entity
@Table(name = "orditemdiscount", schema = "spr")
@Getter
@Setter
@Transactional
public class OrdItemDiscount implements Serializable {

    @Column(name = "ordIDid", table = "orditemdiscount", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ordIDid;

    @ManyToOne(targetEntity = OrdItem.class)
    private OrdItem ordItem;

    @ManyToOne(targetEntity = Discountrule.class)
    private Discountrule discountrule;
}
