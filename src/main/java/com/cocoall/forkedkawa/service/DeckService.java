package com.cocoall.forkedkawa.service;

import com.cocoall.forkedkawa.database_service.DeckDS;
import com.cocoall.forkedkawa.dto.DeckDto;
import com.cocoall.forkedkawa.entity.Deck;
import com.cocoall.forkedkawa.mapper.IDeckMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DeckService {

    private DeckDS deckDS;
    private IDeckMapper deckMapper;

    @Autowired
    public DeckService(DeckDS deckDS, IDeckMapper deckMapper){
        this.deckDS = deckDS;
        this.deckMapper = deckMapper;
    }

    public DeckDto saveDeck(DeckDto deckDto){
        Deck deck = deckMapper.dtoToEntity(deckDto);
        deck = deckDS.saveDeck(deck);
        return deckMapper.entityToDto(deck);
    }

    public DeckDto updateDeck(DeckDto deckDto){
        Deck deck = deckMapper.dtoToEntity(deckDto);
        deck = deckDS.updateDeck(deck);
        return deckMapper.entityToDto(deck);
    }

    public DeckDto getDeckById(long id){
        Deck deck = deckDS.getDeckById(id);

        if(deck == null){ return null;}

        DeckDto ret = deckMapper.entityToDto(deck);
        return ret;
    }

    public void deleteDeckById(long id){
        deckDS.deleteDeckById(id);
    }

    public List<DeckDto> get10LastModifiedDeck(){
        List<DeckDto> ret = new ArrayList<>();
        List<Deck> decks =  deckDS.get10LastModifiedDeck();

        decks.stream().forEach(deck -> ret.add(deckMapper.entityToDto(deck)));

        return ret;
    }

}
