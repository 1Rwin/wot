package com.filrob.wot.repository;

import com.filrob.wot.domain.card.BaseCard;
import com.filrob.wot.domain.card.VehicleCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleCardRepository extends CrudRepository<VehicleCard, Integer>, JpaRepository<VehicleCard, Integer> {

//    List<Card> getRandomCard(CardType type, int quantity);

}
