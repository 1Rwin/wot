package com.filrob.wot.repository;

import com.filrob.wot.domain.card.Card;
import com.filrob.wot.domain.card.enums.CardType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CardsRepository extends CrudRepository<Card, Integer>, JpaRepository<Card, Integer> {

//    List<Card> getRandomCard(CardType type, int quantity);

}
