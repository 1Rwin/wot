package com.filrob.wot.domain.player;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Player {

    private int playerId;
    private String name;
    private boolean ifFirst;
    private PlayerTable playerTable;
}
