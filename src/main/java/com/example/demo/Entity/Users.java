package com.example.demo.Entity;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
@Table(name = "users")
public class Users {
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq_gen")
    @SequenceGenerator(name = "user_seq_gen", sequenceName = "user_seq", allocationSize = 1)
    @Id
    private Long id;

    @Column(name = "name")
    private String userName;


    @ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinTable(name = "users_roles",
            foreignKey = @ForeignKey(name = "FK_user_role_user_id"),
            joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),
            inverseForeignKey = @ForeignKey(name = "FK_user_role_role_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id"),
            uniqueConstraints = @UniqueConstraint(name = "UNIQUE_role_id_user_id",columnNames = {"user_id", "role_id"})
    )
    private Collection<Roles> roles;

}