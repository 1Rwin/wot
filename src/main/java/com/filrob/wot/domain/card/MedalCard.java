package com.filrob.wot.domain.card;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "MEDAL_CARDS")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MedalCard {

    @Id
    @GeneratedValue
    private int id;
    private String cardName;
    private int cardValue;
    private int medalValue;
    private String nationality;
}
