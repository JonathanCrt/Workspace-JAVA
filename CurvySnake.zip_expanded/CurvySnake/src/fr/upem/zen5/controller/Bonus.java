package fr.upem.zen5.controller;

import javax.naming.TimeLimitExceededException;

public class Bonus implements Cloneable{

    private int duration = 7000;
    private int speed = 0; 
    private int size = 0;
    private int nextHope = 0;
    private boolean wallThrough = false;
    private boolean inverseDirection = false;
    private boolean eraseAll = false;

    private Bonus() {
    }

    private Bonus(Bonus b) {
        this.duration = b.duration;
        this.speed = b.speed;
        this.size = b.size;
        this.nextHope = b.nextHope;
        this.wallThrough = b.wallThrough;
        this.inverseDirection = b.inverseDirection;
        this.eraseAll = b.eraseAll;
    }

    public static Bonus speed(int speed) {
        Bonus b = new Bonus();
        b.speed = speed;
        return b;
    }


    public static Bonus size(int size) {
        Bonus b = new Bonus();
        b.size = size;
        return b;
    }

    public static Bonus nextHope(int nextHope) {
        Bonus b = new Bonus();
        b.nextHope = nextHope;
        return b;
    }

    public static Bonus wallThrough(boolean wallThrough) {
        Bonus b = new Bonus();
        b.wallThrough = wallThrough;
        return b;
    }

    public static Bonus inverseDirection(boolean inverseDirection) {
        Bonus b = new Bonus();
        b.inverseDirection = inverseDirection;
        return b;
    }

    public static Bonus eraseAll(boolean eraseAll) {
        Bonus b = new Bonus();
        b.eraseAll = eraseAll;
        return b;
    }

    public int speed() throws IllegalAccessException {
        if(this.eraseAll) throw new IllegalAccessException();
        return this.speed;
    }

    public int size() throws IllegalAccessException {
        if(this.eraseAll) throw new IllegalAccessException();
        return this.size;
    }

    public int nextHope() throws IllegalAccessException {
        if(this.eraseAll) throw new IllegalAccessException();
        return this.nextHope;
    }

    public boolean wallThrough() throws IllegalAccessException {
        if(this.eraseAll) throw new IllegalAccessException();
        return this.wallThrough;
    }

    public boolean inverseDirection() throws IllegalAccessException {
        if(this.eraseAll) throw new IllegalAccessException();
        return this.inverseDirection;
    }

    public boolean eraseAll() {
        return this.eraseAll;
    }

    public void decrement() throws TimeLimitExceededException {
        this.duration--;
        if(this.duration <= 0)
            throw new TimeLimitExceededException();
        
    }

    public int getDuration() {
        return duration;
    }

    public Bonus setDuration(int duration) {
        this.duration = duration;
        return this;
    }

    public boolean isA(BonusAvailable bonus) {
        if(speed != bonus.get().speed) return false;
        if(size != bonus.get().size) return false;
        if(nextHope != bonus.get().nextHope) return false;
        if(wallThrough != bonus.get().wallThrough) return false;
        if(inverseDirection != bonus.get().inverseDirection) return false;
        return eraseAll == bonus.get().eraseAll;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(!(o instanceof Bonus)) return false;

        Bonus bonus = (Bonus) o;

        if(speed != bonus.speed) return false;
        if(size != bonus.size) return false;
        if(nextHope != bonus.nextHope) return false;
        if(wallThrough != bonus.wallThrough) return false;
        if(inverseDirection != bonus.inverseDirection) return false;
        return eraseAll == bonus.eraseAll;

    }

    @Override
    public int hashCode() {
        int result = speed;
        result = 31 * result + size;
        result = 31 * result + nextHope;
        result = 31 * result + (wallThrough ? 1 : 0);
        result = 31 * result + (inverseDirection ? 1 : 0);
        result = 31 * result + (eraseAll ? 1 : 0);
        return result;
    }

    @Override
    public Object clone() {
        Object b = new Bonus(this);
        return b;
    }

    @Override
    public String toString() {
        return "Bonus{" +
                       "Duration=" + duration +
                       ", Speed=" + speed +
                       ", Size=" + size +
                       ", Next Hope=" + nextHope +
                       ", Wall Through=" + wallThrough +
                       ", Inverse Direction=" + inverseDirection +
                       ", Erase All=" + eraseAll +
                       '}';
    }
}
