package com.filrob.wot.repository;

import com.filrob.wot.domain.card.BaseCard;
import com.filrob.wot.domain.card.Cards;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BaseCardRepository extends CrudRepository<BaseCard, Integer>, JpaRepository<BaseCard, Integer> {

//    List<Card> getRandomCard(CardType type, int quantity);

}
