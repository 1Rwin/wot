package com.filrob.wot.infrastructure.actions;

import com.filrob.wot.domain.actions.AttackRequest;
import com.filrob.wot.domain.actions.AttackResult;
import com.filrob.wot.domain.cards.Cards;
import com.filrob.wot.domain.cards.enums.CardType;
import com.filrob.wot.domain.skill.SkillResult;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class ActionFacadeImpl implements ActionFacade {

//    private final CardsRepository cardsRepository;

    @Override
    public List<Cards> givePlayerNewCards(int playerId, CardType cardType, int quantity) {
        return null;
    }

    @Override
    public AttackResult attack(int playerId, AttackRequest attackRequest) {
        return null;
    }

    @Override
    public void repair(int playerId) {
    }

    @Override
    public List<Cards> showCards(int playerId) {
        return null;
    }

    @Override
    public Cards buyCard(int playerId, int cardId) {
        return null;
    }

    @Override
    public SkillResult useSkill(int playerId, int cardId) {
        return null;
    }
}
