package com.example.demo.Entity;

import jakarta.persistence.*;
import org.apache.catalina.User;

import java.util.Set;

@Entity
@Table(name = "roles")

public class Roles {
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "role_seq_gen")
    @SequenceGenerator(name = "role_seq_gen", sequenceName = "role_setup", allocationSize = 1)
    @Id
    private Integer  id;

    @Column(name = "role")
    private String role;


}