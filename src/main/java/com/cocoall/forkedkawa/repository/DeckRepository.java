package com.cocoall.forkedkawa.repository;

import com.cocoall.forkedkawa.entity.Deck;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface DeckRepository extends JpaRepository<Deck, Long>, QuerydslPredicateExecutor<Deck> {
}
