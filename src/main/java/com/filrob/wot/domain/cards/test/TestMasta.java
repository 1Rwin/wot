package com.filrob.wot.domain.cards.test;

import lombok.Data;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "test_type",
    discriminatorType = DiscriminatorType.STRING)
@Data
public class TestMasta {

    @Id
    @GeneratedValue
    private Integer id;
    private String cardName;

}
