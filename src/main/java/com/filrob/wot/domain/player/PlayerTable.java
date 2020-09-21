package com.filrob.wot.domain.player;

import com.filrob.wot.domain.card.Cards;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class PlayerTable {

    private int playerId;
    private List<Cards> playerCards;
    private List<Cards> playerHands;
    private List<Cards> playerGarage;
    private List<Cards> playerMagazine;
    private List<Cards> playerBases;



}
