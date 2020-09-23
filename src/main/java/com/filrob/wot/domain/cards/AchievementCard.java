package com.filrob.wot.domain.cards;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "AchievementCard")
public class AchievementCard extends Cards {

    private Integer medalValue;
}
