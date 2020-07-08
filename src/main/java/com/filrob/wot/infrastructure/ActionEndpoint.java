package com.filrob.wot.infrastructure;

import com.filrob.wot.domain.actions.AttackRequest;
import com.filrob.wot.domain.actions.AttackResult;
import com.filrob.wot.domain.card.Card;
import com.filrob.wot.domain.card.enums.CardType;
import com.filrob.wot.domain.skill.SkillResult;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ActionEndpoint {

    private final ActionFacade actionFacade;

    @GetMapping("/action/getNewCards")
    public List<Card> getNewCards(int playerId, CardType cardType, int quantity){
        return actionFacade.givePlayerNewCards(playerId,cardType,quantity);
    }

    @PostMapping("/action/attack")
    public AttackResult attackPlayer(int playerId, @RequestBody AttackRequest attackRequest){
        return actionFacade.attack(playerId, attackRequest);
    }

    @GetMapping("/action/repairBase")
    public void repairBase(int playerId){
        actionFacade.repair(playerId);
    }

    @GetMapping("/action/showCards")
    public List<Card> showCards(int playerId){
        return actionFacade.showCards(playerId);
    }

    @GetMapping("/action/buyCard")
    public Card buyCard(int playerId, int cardId){
        return actionFacade.buyCard(playerId, cardId);
    }

    @PostMapping("/action/useSkill")
    public SkillResult useSkill(int playerId, int cardId){
        return actionFacade.useSkill(playerId, cardId);
    }

}
