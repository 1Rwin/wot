package com.filrob.wot.repository;

import com.filrob.wot.domain.card.AchievementCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AchievementCardRepository extends CrudRepository<AchievementCard, Integer>, JpaRepository<AchievementCard, Integer> {

}
