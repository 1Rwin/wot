package com.filrob.wot.domain.card;

import com.filrob.wot.domain.nationality.Nationality;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
@DiscriminatorValue(value="MedalCard")
public class MedalCard extends Cards {

    private int cardValue;
    private int medalValue;
    @Enumerated(value = EnumType.STRING)
    private Nationality nationality;
}
