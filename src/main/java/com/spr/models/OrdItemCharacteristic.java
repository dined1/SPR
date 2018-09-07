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
@Table(name = "orditemcharacteristic", schema = "spr")
@Getter
@Setter
@Transactional
public class OrdItemCharacteristic implements Serializable {
    @Column(name = "OrdItemCharacteristicId", table = "orditemcharacteristic", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ordItemCharacteristicId;

    @ManyToOne(targetEntity = Characteristics.class)
    private Characteristics ItemCharacteristic;

    @ManyToOne(targetEntity = OrdItem.class)
    private OrdItem ordItem;

}
