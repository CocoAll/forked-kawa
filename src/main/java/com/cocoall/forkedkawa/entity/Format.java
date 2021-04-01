package com.cocoall.forkedkawa.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Format {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nom;
}
