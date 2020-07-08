package com.filrob.wot.domain.actions;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AttackRequest {
    private int attackerId;
    private int defenderId;
    private int attackerCardId;
    private int defenderCardId;
}
