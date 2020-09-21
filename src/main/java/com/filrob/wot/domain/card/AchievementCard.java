package com.filrob.wot.domain.card;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "AchievementCard")
public class AchievementCard extends Cards {

    private int medalValue;
}
