package com.filrob.wot.domain.card;

import com.filrob.wot.domain.nationality.Nationality;
import com.filrob.wot.domain.vehicle.VehicleType;

import javax.persistence.*;

@Entity
@DiscriminatorValue(value = "VehicleCard")
public class VehicleCard extends Cards {

    private int cardValue;
    private boolean ifNational;
    private int cardCost;
    @Enumerated(value = EnumType.STRING)
    private Nationality nationality;
    private int attack;
    private int defence;
    private int healthPoints;
    @Enumerated(value = EnumType.STRING)
    private VehicleType vehicleType;
    private String skill1;
    @Column(name = "skill1_Value")
    private int skill1Value;
    private String skill2;
    @Column(name = "skill2_Value")
    private int skill2Value;
    private boolean ifDefensive;
    private int defendingCardId;

}
