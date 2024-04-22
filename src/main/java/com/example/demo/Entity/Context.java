package com.example.demo.Entity;

import jakarta.persistence.*;

import java.util.Collection;


@Entity
@Table(name="contexts")
public class Context {
    @GeneratedValue(strategy = GenerationType.SEQUENCE,  generator = "context_seq_gen")
    @SequenceGenerator(sequenceName = "context_seq", name="context_seq", allocationSize = 1)

    @Id
    private Integer Id;

    @Column(name ="context_name", nullable = false, length = 100)
    private String name;


//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "informations_id", referencedColumnName = "id",
//            foreignKey = @ForeignKey(name="pk_id_fk_information_id"))
//
//    private Information information;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "context_informations",
            foreignKey = @ForeignKey(name = "FK_context_informations_id"),
            joinColumns = @JoinColumn(name = "context_id", referencedColumnName = "id"),
            inverseForeignKey = @ForeignKey(name = "FK_context_informations_informations_id"),
            inverseJoinColumns = @JoinColumn(name = "information_id", referencedColumnName = "id"),
            uniqueConstraints = @UniqueConstraint(name = "UNIQUE_",
                    columnNames = {"context_id", "information_id"})
    )
    private Collection<Information> informations;


}
