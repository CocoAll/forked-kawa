package com.cocoall.forkedkawa.database_service;

import com.cocoall.forkedkawa.entity.Deck;
import com.cocoall.forkedkawa.repository.DeckRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class DeckDS {

    private DeckRepository deckRepository;

    @Autowired
    public DeckDS(DeckRepository deckRepository){
        this.deckRepository = deckRepository;
    }

    public Deck getDeckById(long id){
        return deckRepository.findById(id).orElse(null);
    }

    public void deleteDeckById(long id){deckRepository.deleteById(id);}

    public Deck saveDeck(Deck deck){
        deck.setDateDerniereModification(LocalDateTime.now());
        return deckRepository.saveAndFlush(deck);
    }

    public Deck updateDeck(Deck deck){
        deck.setDateDerniereModification(LocalDateTime.now());
        return deckRepository.saveAndFlush(deck);
    }

    public List<Deck> get10LastModifiedDeck(){
        return deckRepository.findTop10ByOrderByDateDerniereModification();
    }
}
