package fr.upem.zen5.controller;

import java.awt.geom.Ellipse2D;
import java.awt.geom.RectangularShape;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

public class Bonus_List {

    private final LinkedList<Entry<RectangularShape, Bonus>> bonusPosition;

    private final static int DEFAULT_DIAMETER = Movement.defaultDiameter * 5;

    public Bonus_List() {
        this.bonusPosition = new LinkedList<>();
    }

    public Bonus_List(Bonus_List b) {
        this.bonusPosition = b.bonusPosition;
    }

    public void add(RectangularShape position, Bonus bonus) {
        this.bonusPosition.add(new Entry<>(position, bonus));
    }

    @SuppressWarnings("unchecked")
	public Entry<RectangularShape, Bonus> random() {
        Random r = new Random();

        if(r.nextInt(1000) != 48 || this.bonusPosition.size() >= 10)
            return null;

        int x;
        int y;
        RectangularShape position;

        do {
            x = r.nextInt((int) Snake.getGameSize().getWidth() - DEFAULT_DIAMETER) + (int) Snake.getGameSize().getX();
            y = r.nextInt((int) Snake.getGameSize().getHeight() - DEFAULT_DIAMETER) + (int) Snake.getGameSize().getY();

            position = new Ellipse2D.Float(x, y, DEFAULT_DIAMETER, DEFAULT_DIAMETER);
        } while(this.intersects(position) || !Snake.getGameSize().intersects(position.getBounds2D()) ||
                        !Snake.positionIsFree(position));

        this.add(position, BonusAvailable.random());
        return (Entry<RectangularShape, Bonus>) this.bonusPosition.getLast().clone();
    }

    public boolean intersects(RectangularShape shape) {
        for(Entry<RectangularShape, Bonus> entry : this.bonusPosition) {
            if(shape.intersects(entry.getKey().getBounds2D()))
                return true;
        }

        return false;
    }

    public Iterator<Entry<RectangularShape, Bonus>> iterator() {
        return this.bonusPosition.iterator();
    }
}
