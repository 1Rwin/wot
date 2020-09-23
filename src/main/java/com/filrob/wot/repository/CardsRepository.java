package com.filrob.wot.repository;

import com.filrob.wot.domain.cards.Cards;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardsRepository extends CrudRepository<Cards, Integer>, JpaRepository<Cards, Integer> {

}
