package com.cocoall.forkedkawa.database_service;

import com.cocoall.forkedkawa.entity.Card;
import com.cocoall.forkedkawa.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CardDS {

    @Autowired
    private CardRepository cardRepository;

    public long saveCard(Card card){
        card = cardRepository.save(card);
        return card.getId();
    }

    public Card getCardById(long id){
        return cardRepository.findById(id).get();
    }

}
