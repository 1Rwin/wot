package com.filrob.wot.domain.card;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "BARRACKS_CARDS")
//@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BarracksCard {

    @Id
    @GeneratedValue
    private int id;
    private String cardName;
    private int cardValue;
    private String skill1;
    @Column(name = "SKILL1_VALUE")
    private int skill1Value;
}
