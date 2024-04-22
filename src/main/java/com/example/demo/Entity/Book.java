package com.example.demo.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "books")
public class Book {
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "book_seq_gen")
    @SequenceGenerator(name = "book_seq_gen", sequenceName = "book_setup", allocationSize = 1)
    @Id
    private Long id;

    @Column(name = "customer")
    private String customer;

    @Column(name = "book_id")
    private String book_id;





    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "id",
            foreignKey = @ForeignKey(name="user_user_id"))

    private Book book;




    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "ground_id", referencedColumnName = "id",
            foreignKey = @ForeignKey(name="fk_ground_id"))

    private Ground ground;

}