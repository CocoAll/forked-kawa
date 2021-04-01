package com.cocoall.forkedkawa.entity;

import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
public class DeckCard implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="deck_id", nullable=false)
    private Deck deck;

    @OneToOne
    @JoinColumn(name="card_id", nullable=false)
    private Card card;

    @Column
    private int quantite;
}
