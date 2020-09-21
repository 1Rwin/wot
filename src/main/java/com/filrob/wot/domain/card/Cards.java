package com.filrob.wot.domain.card;

import com.filrob.wot.domain.card.enums.CardType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import static javax.persistence.InheritanceType.SINGLE_TABLE;

@Entity
@Inheritance(strategy=SINGLE_TABLE)
@DiscriminatorColumn(name="card_type",discriminatorType = DiscriminatorType.STRING)
@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Cards {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String cardName;
    @Enumerated(value=EnumType.STRING)
    private CardType type;

}
