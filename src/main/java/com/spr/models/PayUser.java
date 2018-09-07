package com.spr.models;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "payusers", schema = "spr", uniqueConstraints = {@UniqueConstraint(columnNames = "email", name = "users_unique_login_idx")})
public class PayUser {

    @Column(name = "payuserid", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long payuserid;

    @Column(name = "login", nullable = false, unique = true)
    @NotEmpty
    private String login;

    @Column(name = "password", nullable = false)
    @NotEmpty
    private String password;

    @Column(name = "first_name", nullable = false)
    @NotEmpty
    private String firstName;

    @Column(name = "last_name", nullable = false)
    @NotEmpty
    private String lastName;

    @Column(name = "email", nullable = false)
    @NotEmpty
    @Email
    private String email;

    @Column(name = "registered", columnDefinition = "timestamp default now()")
    private Date registered = new Date();

    @Column(name = "enabled", nullable = false)
    @NotNull
    private boolean enabled = true;

    @OneToMany(cascade = CascadeType.REMOVE, fetch = FetchType.EAGER, mappedBy = "user")
    private List<Account> accounts;
}
