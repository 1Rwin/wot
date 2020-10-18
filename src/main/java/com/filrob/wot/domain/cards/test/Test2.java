package com.filrob.wot.domain.cards.test;

import lombok.Data;
import lombok.ToString;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("test2")
@Data
@ToString
public class Test2 extends TestMasta {

    private Integer medalValue;
}
