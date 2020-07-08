package com.filrob.wot.domain.actions;

import com.filrob.wot.domain.card.Card;
import com.filrob.wot.domain.player.Player;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AttackResult {
    
    private Player attacker;
    private Player defender;
    private Card defendingCard;
    
}
