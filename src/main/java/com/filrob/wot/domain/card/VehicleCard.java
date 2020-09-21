package com.filrob.wot.domain.card;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "VEHICLE_CARDS")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class VehicleCard {

    @Id
    @GeneratedValue
    private int id;
    private String cardName;
    private int cardValue;
    private boolean ifNational;
    private int cardCost;
    private String nationality;
    private int attack;
    private int defence;
    private int healthPoints;
    private String vehicleType;
    private String skill1;
    @Column(name = "SKILL1_VALUE")
    private int skill1Value;
    private String skill2;
    @Column(name = "SKILL2_VALUE")
    private int skill2Value;
//    private boolean ifDefendable;  TODO: ogarnąć o co chodziło
    private int defendingCardId;

}
