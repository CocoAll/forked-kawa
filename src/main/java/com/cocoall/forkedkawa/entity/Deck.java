package com.cocoall.forkedkawa.entity;

import lombok.Data;
import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
public class Deck {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nom;

    @OneToMany(mappedBy="deck")
    private List<DeckCard> carteList;

    @OneToOne
    private Format format;

    @Column
    private boolean favori = false;

    @Column
    private LocalDateTime dateDerniereModification;
}
