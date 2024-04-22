package com.example.demo.Entity;

import jakarta.persistence.*;


@Entity
@Table(name="informations")
public class Information{
    @GeneratedValue(strategy = GenerationType.SEQUENCE,  generator = "informations_seq_gen")
    @SequenceGenerator(sequenceName = "informations_seq", name="informations_seq", allocationSize = 1)

    @Id
    private Integer Id;

    @Column(name ="information_name", nullable = false, length = 100)
    private String name;


    @Column(name = "age",length = 10, nullable = false)
    private Integer age;
}
