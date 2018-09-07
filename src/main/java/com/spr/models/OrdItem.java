package com.spr.models;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Proxy;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 17.12.2016.
 */
@Entity
@Table(name = "orditem", schema = "spr")
@Proxy(lazy = false)
@Getter
@Setter
@Transactional
public class OrdItem implements Serializable {

    @Column(name = "OrdItemId", table = "orditem", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long orditemId;

    @Column(name = "Name", table = "orditem")
    @Basic
    private String name;

    @Column(name = "Type", table = "orditem")
    @Basic
    private String type;

    @Column(name = "Description", table = "orditem")
    @Basic
    private String description;

    @Column(name = "DefMP", table = "orditem", precision = 12)
    @Basic
    private Float defMP;

    @Column(name = "DefOTP", table = "orditem", precision = 12)
    @Basic
    private Float defOTP;

    @Column(name = "ModifiedDate", table = "orditem")
    @Basic
    private String modifiedDate;

    @Column(name = "locationDistribute", table = "orditem")
    @Basic
    private String locationDistribute;

    @Column(name = "parentId", table = "orditem")
    @Basic
    private Long parentId;

    @Column(name = "status", table = "orditem")
    @Basic
    private String status;

    @ManyToOne(targetEntity = OrdItem.class)
    private OrdItem parent;

    @Column(name = "location", table = "orditem")
    @Basic
    private Long location;

    @Column(name = "orderedBy", table = "orditem")
    @Basic
    private Long orderedBy;

    @Column(name = "initialVersion", table = "orditem")
    @Basic
    private Long initialVersion;

    @OneToMany(targetEntity = OrdItem.class, mappedBy = "parent", cascade = {CascadeType.REMOVE, CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.EAGER)
    private List<OrdItem> ordItems = new ArrayList<>();

    @OneToMany(targetEntity = ProductItems.class, mappedBy = "ordItem", cascade = CascadeType.REMOVE)
    private List<ProductItems> productItemses;

    @OneToMany(targetEntity = OrdItemDiscount.class, mappedBy = "discountrule", cascade = CascadeType.REMOVE)
    private List<OrdItemDiscount> itemdiscounts;

    @OneToMany(targetEntity = OrdItemCharacteristic.class, mappedBy = "ordItem", cascade = CascadeType.REMOVE)
    private List<OrdItemCharacteristic> itemCharacteristic;

}
