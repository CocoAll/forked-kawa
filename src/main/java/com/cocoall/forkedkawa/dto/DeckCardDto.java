package com.cocoall.forkedkawa.dto;

import lombok.Data;

@Data
public class DeckCardDto {
    private long id;
    private DeckDto deck;
    private CardDto card;
    private int quantite;
}
