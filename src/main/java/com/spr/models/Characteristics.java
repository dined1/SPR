package com.spr.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Admin on 17.12.2016.
 */
@Entity
@Getter
@Setter
@Transactional
@Table(name = "characteristics", schema = "spr")
public class Characteristics implements Serializable {
    @Column(name = "characteristicId", table = "characteristics", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long characteristicId;

    @Column(name = "Characteristic", table = "characteristics")
    @Basic
    private String Characteristic;

    @Column(name = "CharacteristicValue", table = "characteristics")
    @Basic
    private String CharacteristicValue;

    @OneToMany(targetEntity = ItemCharacteristic.class, mappedBy = "itemCharacteristic", cascade = CascadeType.REMOVE)
    private List<ItemCharacteristic> itemCharacteristic;

    @OneToMany(targetEntity = OrdItemCharacteristic.class, mappedBy = "ItemCharacteristic", cascade = CascadeType.REMOVE)
    private List<OrdItemCharacteristic> orditemCharacteristic;

}
