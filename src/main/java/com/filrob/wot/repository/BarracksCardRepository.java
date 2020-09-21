package com.filrob.wot.repository;

import com.filrob.wot.domain.card.BarracksCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BarracksCardRepository extends CrudRepository<BarracksCard, Integer>, JpaRepository<BarracksCard, Integer> {

}
