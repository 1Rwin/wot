package com.filrob.wot.infrastructure;

import com.filrob.wot.domain.actions.AttackRequest;
import com.filrob.wot.domain.actions.AttackResult;
import com.filrob.wot.domain.card.Cards;
import com.filrob.wot.domain.card.enums.CardType;
import com.filrob.wot.domain.skill.SkillResult;
import com.filrob.wot.repository.CardsRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class ActionEndpoint {

    private final ActionFacade actionFacade;
    private final CardsRepository cardsRepository;

    @GetMapping("/TEST/getAllCards")
    public List<Cards> getAllCards(){
       return cardsRepository.findAll();
    }

    @GetMapping("/action/getNewCards")
    public List<Cards> getNewCards(int playerId, CardType cardType, int quantity){
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
    public List<Cards> showCards(int playerId){
        return actionFacade.showCards(playerId);
    }

    @GetMapping("/action/buyCard")
    public Cards buyCard(int playerId, int cardId){
        return actionFacade.buyCard(playerId, cardId);
    }

    @PostMapping("/action/useSkill")
    public SkillResult useSkill(int playerId, int cardId){
        return actionFacade.useSkill(playerId, cardId);
    }

}
