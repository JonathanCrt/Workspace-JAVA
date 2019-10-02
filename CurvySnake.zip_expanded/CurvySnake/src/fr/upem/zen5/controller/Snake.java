package fr.upem.zen5.controller;

import fr.upem.zen5.controller.exeptions.BonusException;
import fr.upem.zen5.controller.exeptions.CollisionException;
import fr.upem.zen5.controller.exeptions.SizeException;

import javax.naming.TimeLimitExceededException;
import java.awt.*;
import java.awt.geom.RectangularShape;
import java.util.*;
import java.util.List;

/**This class consist to manage a snake movement and body. The class managed
 * also the user steering action.*/

public class Snake {
    
    private int alpha = 0;
    private static final List<Snake> SNAKE_LIST = new LinkedList<>();
    private final static int defaultSpeed = 1;
    private static Bonus_List bonusListInGame = null;
    private final Movement movement;
    private final List<Bonus> bonusList = new LinkedList<>();

    public Snake(Point init, int alpha) throws IllegalArgumentException {
        if(Math.abs(alpha) > 360)
            throw new IllegalArgumentException();

        this.alpha = alpha;

        this.movement = new Movement(init);

        SNAKE_LIST.add(this);
    }

    public static boolean destroy(Snake s) {
        return SNAKE_LIST.remove(s);
    }

    public static RectangularShape getGameSize() {
        return Movement.getGameSize();
    }

    public static void setSize(RectangularShape rectangle) {
        Movement.setGameSize(rectangle);
    }

    public static Bonus_List getBonusListInGame() {
        return bonusListInGame;
    }

    public static void setBonus_List(Bonus_List bonus) {
        bonusListInGame = bonus;
    }

    public static void cleanAll(List<RectangularShape> erase) {
        SNAKE_LIST.forEach(snake -> {
            snake.clean(erase);
        });
    }

    public static void decrementAll() {
        SNAKE_LIST.forEach(Snake::decrement);
    }

    /**Method to detect if a position is not used by a Snake body element.*/
    public static boolean positionIsFree(RectangularShape position) {
        for(Snake snake : SNAKE_LIST) { 
        	if(snake.movement.intersects(position)) 
        		return false;
        }
        return true;
    }

    static List<Snake> getSnakeList() {
        return Collections.unmodifiableList(SNAKE_LIST);
    }

    public void move(List<RectangularShape> add, List<RectangularShape> erase)
            throws CollisionException, IllegalAccessException, SizeException, BonusException, IllegalArgumentException {
        if(add == null || erase == null)
            throw new NullPointerException();

        int speedBonus = defaultSpeed;
        int sizeBonus = 0;
        int nextHope = 0;

        boolean wallThrough = false;

        // Check all bonus
        for(Bonus bonus : this.bonusList) {
            speedBonus += bonus.speed();
            sizeBonus += bonus.size();
            nextHope += bonus.nextHope();

            wallThrough = wallThrough || bonus.wallThrough();
        }

        if(speedBonus < 1) 
        	speedBonus = 1;
        
        if(sizeBonus < -Movement.defaultDiameter + 5) 
        	sizeBonus = -Movement.defaultDiameter + 5;
        
        if(nextHope > 50) 
        	nextHope = 50;
        
        if((int) (Math.random() * 25) == 13) 
        	nextHope = 0;

        // create the movement of 'speed-1' move
        for(int i = 0 ; i < speedBonus ; i++) {
            // NextHope available only for the first move of this move action
            if(i != 0)
                nextHope = 0;

            this.movement.move(this.getDirection(), sizeBonus, nextHope, wallThrough, erase);

            add.add(this.getHead());
            this.detectBonus(add, erase);
        }
    }

    private void detectBonus(List<RectangularShape> add, List<RectangularShape> erase)
            throws BonusException, IllegalAccessException {

        if(erase == null)
            throw new NullPointerException();

        if(bonusListInGame == null)
            throw new BonusException("The Bonus_List is not set for Snake");

        Entry<RectangularShape, Bonus> entry;
        Iterator<Entry<RectangularShape, Bonus>> it = bonusListInGame.iterator();
        while(it.hasNext()) {
            entry = it.next();

            if(entry.getKey().intersects(this.getHead().getBounds())) {
                // Delete the bonus display
                erase.add(entry.getKey());
                // if it is an erase all, erase all body element
                this.addBonus(entry.getValue(), erase);
                it.remove();

            }
        }

    }
    
    Deque<RectangularShape> getMove() {
        return this.movement.getMove();
    }

    public void changeDirection(Go_To m, boolean inTurn) throws IllegalAccessException {
        boolean inverse = true;

        int angle = inTurn ? 10 : 15;

        // Check only for inverse direction bonus
        for(Bonus bonus : this.bonusList) {
            if(bonus.inverseDirection())
                inverse = !inverse;
        }

        if(inverse) {
            if(m == Go_To.LEFT) m = Go_To.RIGHT;
            else if(m == Go_To.RIGHT) m = Go_To.LEFT;
        }

        if(m == Go_To.LEFT) {
            this.alpha += angle;

            if(this.alpha >= 1800)
                this.alpha = 0;
            
        } 
        else if(m == Go_To.RIGHT) {
            this.alpha -= angle;

            if(this.alpha <= -180)
                this.alpha = 0;
        }
    }

    public void addBonus(Bonus b, List<RectangularShape> erase) {
        if(b != null) {
            if(b.eraseAll()) 
                Snake.cleanAll(erase);
            else 
                this.bonusList.add(b);
        }
    }

    public RectangularShape getHead() {
        return this.movement.getHead();
    }

    public RectangularShape getQueue() {
        return this.movement.getQueue();
    }

    private void decrement() {
        Iterator<Bonus> it = this.bonusList.iterator();
        while(it.hasNext()) {
            Bonus b = it.next();

            try {
                b.decrement();
            } catch(TimeLimitExceededException e) {
                it.remove();
            }
        }
    }

    public void clean(List<RectangularShape> erase) {
        this.movement.clean(erase);
    }

    public Point getDirection() {
        int x = (int) Math.round(Math.cos(this.alpha * 0.017453292519943) * Movement.defaultDiameter);
        int y = (int) Math.round(Math.sin(this.alpha * 0.017453292519943) * Movement.defaultDiameter);

        return new Point(x, y);
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("Snake: ");

        this.getMove().forEach((ellipse2D) -> {
            s.append("(")
                    .append(ellipse2D.getCenterX()).append(", ")
                    .append(ellipse2D.getCenterY()).append(", ")
                    .append(ellipse2D.getWidth() / 2)
                    .append("), ");
        });
        s.deleteCharAt(s.length() - 1);

        return s.toString();
    }
}

