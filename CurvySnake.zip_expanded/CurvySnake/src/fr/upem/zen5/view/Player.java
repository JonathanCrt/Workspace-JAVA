package fr.upem.zen5.view;

import fr.upem.zen5.controller.Snake;
import java.awt.*;

public class Player {

    private final Snake player;
    private final Color color;

    private boolean alive = true;

    public Player(Snake player, Color color) {
        super();
        this.player = player;
        this.color = color;
    }

    public Snake getPlayer() {
        return player;
    }

    public Color getColor() {
        return color;
    }

    public boolean isAlive() { 
    	return this.alive; 
    }

    public void kill() { 
    	this.alive = false; 
    }


}
