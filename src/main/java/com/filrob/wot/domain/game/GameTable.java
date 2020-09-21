package com.filrob.wot.domain.game;

import com.filrob.wot.domain.card.Cards;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class GameTable {

    private List<Cards> cardsToBuy;
    private List<Cards> junkyard;
    private List<Cards> hiddenCardsPile;
    private List<Cards> notBoughtCards;
    private int firstPlayerId;
    private List<Cards> gameAchievements;
    private List<Cards> medals;

}
