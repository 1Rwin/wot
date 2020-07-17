package com.filrob.wot.domain.card;

import com.filrob.wot.domain.nationality.Nationality;
import com.filrob.wot.domain.skill.Skill;
import com.filrob.wot.domain.vehicle.VehicleType;
import com.filrob.wot.domain.card.enums.CardType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Card {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private CardType type;
    private int value;
    private boolean ifNationalValue;
    private int cost;
    private Nationality nationality;
    private int attack;
    private int defence;
    private int healthPoints;
    private VehicleType vehicleType;
//    private List<Skill> skills;
    private int medalValue;
    private boolean ifDefendable;
    private int defendingCardId;
}
