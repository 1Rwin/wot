package com.filrob.wot.infrastructure;

import com.filrob.wot.domain.actions.AttackRequest;
import com.filrob.wot.domain.actions.AttackResult;
import com.filrob.wot.domain.card.Card;
import com.filrob.wot.domain.card.enums.CardType;
import com.filrob.wot.domain.skill.SkillResult;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class ActionFacadeImpl implements ActionFacade {

//    private final CardsRepository cardsRepository;

    @Override
    public List<Card> givePlayerNewCards(int playerId, CardType cardType, int quantity) {
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
    public List<Card> showCards(int playerId) {
        return null;
    }

    @Override
    public Card buyCard(int playerId, int cardId) {
        return null;
    }

    @Override
    public SkillResult useSkill(int playerId, int cardId) {
        return null;
    }
}
