package com.filrob.wot.domain.game;

import com.filrob.wot.domain.card.Card;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class GameTable {

    private List<Card> cardsToBuy;
    private List<Card> junkyard;
    private List<Card> hiddenCardsPile;
    private List<Card> notBoughtCards;
    private int firstPlayerId;
    private List<Card> gameAchievements;
    private List<Card> medals;

}
