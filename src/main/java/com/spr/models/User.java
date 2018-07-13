package com.spr.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.transaction.Transactional;
import java.util.Set;

@Entity
@Getter
@Setter
@Transactional
@NoArgsConstructor
@ToString
@Table(name = "user", schema = "spr")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String login;
    private String password;
    @Transient
    private String passwordConfirm;
    @ManyToMany(cascade = CascadeType.DETACH)
    @JoinTable(name = "user_role", schema = "spr", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }
}