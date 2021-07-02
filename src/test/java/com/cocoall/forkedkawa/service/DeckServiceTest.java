package com.cocoall.forkedkawa.service;

import com.cocoall.forkedkawa.database_service.DeckDS;
import com.cocoall.forkedkawa.entity.Deck;
import com.cocoall.forkedkawa.mapper.IDeckMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.jdbc.Sql;

public class DeckServiceTest {

    DeckService deckService;
    @Mock
    DeckDS deckDS;

    @BeforeEach
    public void init(){
        deckService = new DeckService(deckDS, Mappers.getMapper(IDeckMapper.class));

        Mockito.when(deckDS.saveDeck(Mockito.any())).thenReturn(new Deck());
    }

    @Test
    public void saveDeckOk(){
    }
}
