/**
 * This file was generated by the JPA Modeler
 */
package com.spr.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import javax.ws.rs.FormParam;
import java.io.Serializable;
import java.util.List;

/**
 * @author dzni0816
 */
@Entity
@Getter
@Setter
@Transactional
@Table(name = "groups", schema = "spr")
public class Groups implements Serializable {

    @Column(name = "GroupId", table = "groups", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long groupId;

    @Column(name = "Name", table = "groups", nullable = false)
    @Basic(optional = false)
    private String name;

    @OneToMany(targetEntity = Itemgroup.class, mappedBy = "groups1", cascade = CascadeType.REMOVE)
    private List<Itemgroup> itemgroups1;

}
