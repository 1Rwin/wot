package com.filrob.wot.domain.cards;

import javax.persistence.*;

@Entity
@DiscriminatorValue(value="BarracksCard")
public class BarracksCard extends Cards{

    private Integer cardValue;
    private String skill1;
    private Integer skill1Value;
}
