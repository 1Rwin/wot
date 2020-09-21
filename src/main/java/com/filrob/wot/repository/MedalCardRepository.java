package com.filrob.wot.repository;

import com.filrob.wot.domain.card.BaseCard;
import com.filrob.wot.domain.card.MedalCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedalCardRepository extends CrudRepository<MedalCard, Integer>, JpaRepository<MedalCard, Integer> {

}
