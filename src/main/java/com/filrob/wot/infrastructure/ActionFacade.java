package com.filrob.wot.infrastructure;

import com.filrob.wot.domain.actions.AttackRequest;
import com.filrob.wot.domain.actions.AttackResult;
import com.filrob.wot.domain.card.Card;
import com.filrob.wot.domain.card.enums.CardType;
import com.filrob.wot.domain.skill.SkillResult;

import java.util.List;

public interface ActionFacade {

    List<Card> givePlayerNewCards(int playerId, CardType cardType, int quantity);

    AttackResult attack(int playerId, AttackRequest attackRequest);

    void repair(int playerId);

    List<Card> showCards(int playerId);

    Card buyCard(int playerId, int cardId);

    SkillResult useSkill(int playerId, int cardId);

}
