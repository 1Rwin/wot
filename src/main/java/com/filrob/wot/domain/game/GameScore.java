package com.filrob.wot.domain.game;

import com.filrob.wot.domain.player.Player;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Map;

@Data
@AllArgsConstructor
public class GameScore {
    private int gameId;
    private Map<Player, Integer> playersResult;
}
