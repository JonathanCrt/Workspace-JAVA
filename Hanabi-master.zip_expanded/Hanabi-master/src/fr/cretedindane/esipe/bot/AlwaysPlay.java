package fr.cretedindane.esipe.bot;

import fr.cretedindane.esipe.action.Action;
import fr.cretedindane.esipe.action.PlayCardAction;
import fr.cretedindane.esipe.controllers.Card;
import fr.cretedindane.esipe.controllers.Colors;
import fr.cretedindane.esipe.controllers.PlayerHand;


import java.util.List;
import java.util.Map;
import java.util.Stack;

public class AlwaysPlay extends Bot {
    public AlwaysPlay(String name){
        super(name);
    }

    @Override
    public Action takenAction(Map<Colors, Stack<Card>> fireworks, List<PlayerHand> playerHands){
        return new PlayCardAction(0);
    }
}
