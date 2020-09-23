package com.filrob.wot.domain.cards;

import com.filrob.wot.domain.nationality.Nationality;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
@DiscriminatorValue(value="MedalCard")
public class MedalCard extends Cards {

    private Integer cardValue;
    private Integer medalValue;
    @Enumerated(value = EnumType.STRING)
    private Nationality nationality;
}
