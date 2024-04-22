package com.example.demo.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "grounds")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Ground{
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ground_seq_gen")
    @SequenceGenerator(name = "ground_seq_gen", sequenceName = "ground_setup", allocationSize = 1)
    @Id
    private Integer id;

    @Column(name = "ground_name")
    private String ground_name;

    @Column(name = "type")
    private String type;



}