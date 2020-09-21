package com.filrob.wot.domain.card;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "ACHIEVEMENT_CARDS")
//@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AchievementCard {

    @Id
    @GeneratedValue
    private int id;
    private String cardName;
    private int medalValue;
}
