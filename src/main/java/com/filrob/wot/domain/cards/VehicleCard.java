package com.filrob.wot.domain.cards;

import com.filrob.wot.domain.nationality.Nationality;
import com.filrob.wot.domain.vehicle.VehicleType;

import javax.persistence.*;

@Entity
@DiscriminatorValue(value = "VehicleCard")
public class VehicleCard extends Cards {

    private Integer cardValue;
    private Boolean ifNational;
    private Integer cardCost;
    @Enumerated(value = EnumType.STRING)
    private Nationality nationality;
    private Integer attack;
    private Integer defence;
    private Integer healthPoints;
    @Enumerated(value = EnumType.STRING)
    private VehicleType vehicleType;
    private String skill1;
    @Column(name = "skill1_Value")
    private Integer skill1Value;
    private String skill2;
    @Column(name = "skill2_Value")
    private Integer skill2Value;
    private Boolean ifDefensive;
    private Integer defendingCardId;

}
