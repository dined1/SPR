package com.spr.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Admin on 17.12.2016.
 */

@Entity
@Getter
@Setter
@Transactional
@Table(name = "itemcharacteristic", schema = "spr")
public class ItemCharacteristic implements Serializable{
    @Column(name = "ItemCharacteristicId", table = "itemcharacteristic", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ItemCharacteristicId;

    @ManyToOne(targetEntity = Characteristics.class)
    private Characteristics itemCharacteristic;

    @ManyToOne(targetEntity = Item.class)
    private Item item;
}
