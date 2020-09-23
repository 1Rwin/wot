package com.filrob.wot.domain.cards;

import javax.persistence.*;

@Entity
@DiscriminatorValue(value="BaseCard")
public class BaseCard extends Cards{

    private Integer medalValue;
}
