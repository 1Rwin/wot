package com.filrob.wot.infrastructure.actions;

import com.filrob.wot.domain.actions.AttackRequest;
import com.filrob.wot.domain.actions.AttackResult;
import com.filrob.wot.domain.cards.Cards;
import com.filrob.wot.domain.cards.enums.CardType;
import com.filrob.wot.domain.skill.SkillResult;

import java.util.List;

public interface ActionFacade {

    List<Cards> givePlayerNewCards(int playerId, CardType cardType, int quantity);

    AttackResult attack(int playerId, AttackRequest attackRequest);

    void repair(int playerId);

    List<Cards> showCards(int playerId);

    Cards buyCard(int playerId, int cardId);

    SkillResult useSkill(int playerId, int cardId);

}