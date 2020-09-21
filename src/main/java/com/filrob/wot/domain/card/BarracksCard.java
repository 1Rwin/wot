package com.filrob.wot.domain.card;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@DiscriminatorValue(value="BarracksCard")
public class BarracksCard extends Cards{

    private int cardValue;
    private String skill1;
    private int skill1Value;
}
