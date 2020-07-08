package com.filrob.wot.domain.player;

import com.filrob.wot.domain.card.Card;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class PlayerTable {

    private int playerId;
    private List<Card> playerCards;
    private List<Card> playerHands;
    private List<Card> playerGarage;
    private List<Card> playerMagazine;
    private List<Card> playerBases;



}
