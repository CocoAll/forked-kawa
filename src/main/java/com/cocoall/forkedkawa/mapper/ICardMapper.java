package com.cocoall.forkedkawa.mapper;

import com.cocoall.forkedkawa.dto.CardDto;
import com.cocoall.forkedkawa.entity.Card;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ICardMapper {
    CardDto entityToDto(Card card);
    Card dtoToEntity(CardDto cardDto);
}
