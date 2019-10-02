package fr.upem.zen5.controller;

import java.util.Random;
import fr.upem.zen5.controller.Bonus;

public enum BonusAvailable {

	SPEED_INCREASE(Bonus.speed(1)),    SPEED_DECREASE(Bonus.speed(-1)),    SIZE_INCREASE(Bonus.size(10)),
    SIZE_DECREASE(Bonus.size(-3)),    NEXT_HOPE(Bonus.nextHope(5).setDuration(50)),
    WALL_THROUGH(Bonus.wallThrough(true)),    INVERSE_DIRECTION(Bonus.inverseDirection(true)),
    ERASE_ALL(Bonus.eraseAll(true));


    static private BonusAvailable[] list = {
                                                   SPEED_INCREASE,
                                                   SPEED_DECREASE,
                                                   SIZE_INCREASE,
                                                   SIZE_DECREASE,
                                                   NEXT_HOPE,
                                                   WALL_THROUGH,
                                                   INVERSE_DIRECTION,
                                                   ERASE_ALL
    };


    private final Bonus bonus;

    BonusAvailable(Bonus bonus) {
        this.bonus = bonus;
    }

    public Bonus get() {
        return (Bonus) bonus.clone();
    }

    public static Bonus random() {
        Random r = new Random();
        return list[r.nextInt(list.length)].get();
    }
}
