package com.cocoall.forkedkawa.database_service;

import com.cocoall.forkedkawa.dto.CardDto;
import com.cocoall.forkedkawa.entity.Card;
import com.cocoall.forkedkawa.mapper.ICardMapper;
import com.cocoall.forkedkawa.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CardDS {

    @Autowired
    private CardRepository cardRepository;

    @Autowired
    private ICardMapper cardMapper;

    public CardDto saveCard(CardDto cardDto){
        Card card = cardMapper.dtoToEntity(cardDto);
        card = cardRepository.save(card);
        cardDto.setId(card.getId());
        return cardDto;
    }

    public CardDto getCardById(Long id){
        Card card = cardRepository.findById(id).get();
        return cardMapper.entityToDto(card);
    }

}
