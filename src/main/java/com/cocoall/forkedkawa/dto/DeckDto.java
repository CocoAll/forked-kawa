package com.cocoall.forkedkawa.dto;

import lombok.Data;
import java.util.List;

@Data
public class DeckDto {
    private long id;
    private String nom;
    private List<DeckCardDto> carteList;
    private boolean favori;
}
