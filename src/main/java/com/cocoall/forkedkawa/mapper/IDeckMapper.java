package com.cocoall.forkedkawa.mapper;

import com.cocoall.forkedkawa.dto.DeckDto;
import com.cocoall.forkedkawa.entity.Deck;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IDeckMapper {
    DeckDto entityToDto(Deck deck);
    Deck dtoToEntity(DeckDto cardDto);
}
