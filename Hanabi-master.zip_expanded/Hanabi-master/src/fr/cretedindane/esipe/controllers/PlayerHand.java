package fr.cretedindane.esipe.controllers;

import java.util.List;

public class PlayerHand {
    private final Player player;
    private List<Card> cards;

    public PlayerHand(Player player, List<Card> cards) {
        this.player = player;
        this.cards = cards;
    }

    public Player getPlayer(){
        return this.player;
    }

    public List<Card> getCards(){
        return this.cards;
    }

    @Override
    public String toString(){
        return "Player "+ this.player.getName() + ", has a hand of " + this.cards + ".\n";
    }
}
