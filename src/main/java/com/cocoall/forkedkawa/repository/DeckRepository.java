package com.cocoall.forkedkawa.repository;

import com.cocoall.forkedkawa.entity.Deck;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DeckRepository extends JpaRepository<Deck, Long> {

    public List<Deck> findTop10ByOrderByDateDerniereModification();
}
