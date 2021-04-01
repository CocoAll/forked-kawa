package com.cocoall.forkedkawa.repository;

import com.cocoall.forkedkawa.entity.DeckCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface DeckCardRepository extends JpaRepository<DeckCard, Long> {
}
