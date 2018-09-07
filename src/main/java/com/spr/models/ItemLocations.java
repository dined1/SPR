package com.spr.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.ws.rs.FormParam;
import java.io.Serializable;

/**
 * Created by dzni0816 on 21.12.2016.
 */
@Entity
@Getter
@Setter
@Transactional
@Table(name = "itemlocations", schema = "spr")
public class ItemLocations implements Serializable {

    @Column(name = "ILid", table = "itemlocations", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long iLid;

    @ManyToOne(targetEntity = Locations.class)
    private Locations location;

    @ManyToOne(targetEntity = Item.class)
    private Item item;
}
