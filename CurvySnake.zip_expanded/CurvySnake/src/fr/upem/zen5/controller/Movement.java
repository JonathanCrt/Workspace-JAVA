package fr.upem.zen5.controller;

import fr.upem.zen5.controller.exeptions.CollisionException;
import fr.upem.zen5.controller.exeptions.SizeException;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.RectangularShape;
import java.util.*;
import java.util.List;

/**This class represent the movement (full body) of the snake.*/
class Movement {

    public static final int defaultDiameter = 10;
    private static RectangularShape gameSize = null;
    private final Deque<RectangularShape> move = new LinkedList<>();
    private boolean isIncreased = false;

    Movement(Point init) {
        Ellipse2D.Float aFloat = new Ellipse2D.Float((float) init.x - defaultDiameter / 2,
                                                     (float) init.y - defaultDiameter / 2,
                                                     defaultDiameter, defaultDiameter);
        this.move.add(aFloat);
    }

    static RectangularShape getGameSize() {
        return gameSize;
    }

    static void setGameSize(RectangularShape rectangle) {
        gameSize = rectangle;
    }

    Deque<RectangularShape> getMove() {
        return this.move;
    }

    RectangularShape getHead() {
        return (RectangularShape) this.move.getLast().clone();
    }

    RectangularShape getQueue() {
        return (RectangularShape) this.move.getFirst().clone();
    }

    boolean intersects() {
        for(Snake snake : Snake.getSnakeList()) {
            if(this.intersects(snake.getMove()))
                return true;
        }
        return false;
    }

    boolean intersects(RectangularShape position) {
        for(RectangularShape shape : this.move) {
            if(position.intersects(shape.getX(), shape.getY(), shape.getWidth(), shape.getHeight()))
                return true;
        }
        return false;
    }

    public boolean intersects(Deque<RectangularShape> bodyList) {
        RectangularShape head = this.getHead();

        boolean himself = false;
        if(this.move == bodyList) himself = true;

        int i = 0;
        int sizeOther = bodyList.size();
        for(RectangularShape shape : bodyList) {
            if(head.intersects(shape.getX(), shape.getY(), shape.getWidth(), shape.getHeight()))
                if(!himself || sizeOther - i > head.getWidth())
                    return true;

            i++;
        }

        return false;
    }

    public boolean isHittingTheWall() throws SizeException {
        if(gameSize == null)
            throw new SizeException();

        RectangularShape head = this.getHead();
        return !gameSize.contains(head.getX(), head.getY(), head.getWidth(), head.getHeight());
    }


    public void move(Point direction, int size, int nextHope, boolean wallThrough, List<RectangularShape> erase) throws
            CollisionException, SizeException {

        if(erase == null)
            throw new NullPointerException();

        Rectangle nextHead = this.move.getLast().getBounds();

        // Manage the next hope position
        for(int i = 0 ; i <= nextHope ; i++) {
            nextHead.translate(direction.x / 2 * (nextHope + 1), direction.y / 2 * (nextHope + 1));
        }

        // Set the new size of the body element
        size += defaultDiameter;
        nextHead.x += nextHead.width - size;
        nextHead.y += nextHead.height - size;
        nextHead.height = size;
        nextHead.width = size;

        // Transform rectangle to ellipse
        RectangularShape nextMove = new Ellipse2D.Float(nextHead.x, nextHead.y, nextHead.width, nextHead.height);


        this.move.add(nextMove);

        // Check if the move generate a wall hit
        if(this.isHittingTheWall()) {
            if(wallThrough)
                this.throughWall(nextMove);
            else 
                // this.move.removeLast();
                throw new CollisionException();
        }

        // Check if the move generate a collision with himself
        if(this.intersects())
            throw new CollisionException();

        this.isIncreased = !this.isIncreased;

        // Every other time, the body size is increased.
        if(!this.isIncreased)
            erase.add(this.move.removeFirst());
    }

    /**Method to move the head of the body to the opposite position when it hit a wall. */
    public void throughWall(RectangularShape head) throws SizeException {
        Rectangle bounds = head.getBounds();

        if(gameSize == null)
            throw new SizeException();

        if(bounds.getX() <= gameSize.getX())
            bounds.x = (int) gameSize.getX() + (int) gameSize.getWidth() - (int) bounds.getWidth() - 1;
        
        if(bounds.getY() <= gameSize.getY())
            bounds.y = (int) gameSize.getY() + (int) gameSize.getHeight() - (int) bounds.getHeight() - 1;
       

        if(bounds.getX() + bounds.getWidth() > gameSize.getX() + gameSize.getWidth() - 1)
            bounds.x = (int) gameSize.getX() + 1;
        
        if(bounds.getY() + bounds.getHeight() > gameSize.getY() + gameSize.getHeight() - 1) 
            bounds.y = (int) gameSize.getY() + 1;
        
        head.setFrame(bounds);
    }


    public void clean(List<RectangularShape> erase) {
        if(erase == null)
            throw new NullPointerException();

        if(this.move.size() == 1)
            return;

        erase.addAll(this.move);

        RectangularShape head = this.move.getLast();
        this.move.clear();
        this.move.add(head);
    }
}
