package com.cocoall.forkedkawa.entity;

import lombok.Data;
import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Deck {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nom;

    @OneToMany(mappedBy="deck")
    private List<DeckCard> carteList;

    @OneToOne
    private Format format;
}
