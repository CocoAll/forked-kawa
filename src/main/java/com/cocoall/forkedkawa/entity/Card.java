package com.cocoall.forkedkawa.entity;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
public class Card  {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nom;

    @Column
    private Integer ccm;

    @Column
    private String colors;
}
