package com.cocoall.forkedkawa.mapper;

import com.cocoall.forkedkawa.dto.DeckCardDto;
import com.cocoall.forkedkawa.entity.DeckCard;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface IDeckCardMapper {

    DeckCardDto entityToDto(DeckCard deckCard);
    DeckCard dtoToEntity(DeckCardDto cardDto);
}
