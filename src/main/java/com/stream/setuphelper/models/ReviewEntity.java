package com.stream.setuphelper.models;

import javax.persistence.*;

@Table(name="reviews")
@Entity
public class ReviewEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private int rating;

    private String textContent;

    @OneToOne
    private UserEntity owner;
}
