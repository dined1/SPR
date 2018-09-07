package com.spr.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Admin on 07.05.2017.
 */
@Entity
@Table(name = "location", schema = "spr")
@Getter
@Setter
@Transactional
public class Location {

    @Column(name = "locationId", table = "location", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long locationId;

    @Column(name = "name", table = "location")
    @Basic
    private String name;

    @ManyToOne(targetEntity = Customer.class)
    private Customer customer;

    @ManyToOne(targetEntity = Address.class)
    private Address address;

    @OneToMany(targetEntity = RelatedLocation.class, mappedBy = "parentLocation", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    private List<RelatedLocation> relatedLocations;

    @OneToMany(targetEntity = So.class, mappedBy = "location", cascade = CascadeType.REMOVE)
    private List<So> so;
}
