package com.cocoall.forkedkawa.repository;

import com.cocoall.forkedkawa.entity.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepository extends JpaRepository<Card, Long>, QuerydslPredicateExecutor<Card> {
}
