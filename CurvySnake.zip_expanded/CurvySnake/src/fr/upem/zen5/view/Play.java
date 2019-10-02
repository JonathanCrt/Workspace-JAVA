package fr.upem.zen5.view;

import fr.umlv.zen5.Application;
import fr.umlv.zen5.Event;
import fr.umlv.zen5.Event.Action;
import fr.umlv.zen5.KeyboardKey;
import fr.umlv.zen5.ScreenInfo;
import fr.upem.zen5.controller.Bonus_List;
import fr.upem.zen5.controller.Go_To;
import fr.upem.zen5.controller.Snake;
import fr.upem.zen5.controller.exeptions.CollisionException;

import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RectangularShape;
import java.util.ArrayList;
import java.util.List;

public class Play {
	/**Create a game case*/
    private static Rectangle gameSize = new Rectangle(0, 0, 500, 500);
    
     /** Create a bonus list for the game*/
    private static Bonus_List bonusListInGame = new Bonus_List();

    /**Play the game*/
    public static void run() {
        // Set environment
        Snake.setSize(gameSize);
        // Set Bonus List
        Snake.setBonus_List(bonusListInGame);


        Player player1 = new Player(new Snake(new Point((int) gameSize.getCenterX(), (int) gameSize.getCenterY()), 0)
                                           , Color.BLACK);

        Application.run(Color.WHITE, context -> {
            Draw.context = context;
            // get the size of the screen
            ScreenInfo screenInfo = context.getScreenInfo();
            float width = screenInfo.getWidth();
            float height = screenInfo.getHeight();
            System.out.println("size of the screen (" + width + " x "
                                       + height + ")");

            gameSize.height = (int) height;
            gameSize.width = (int) width;
            context.renderFrame(graphics -> {
                graphics.setColor(Color.WHITE);
                graphics.fill(new Rectangle2D.Float(0, 0, width, height));

            });


            boolean flag = false;
            int time = 0;

            List<RectangularShape> add = new ArrayList<>();
            List<RectangularShape> erase = new ArrayList<>();

            while(true) {
                Event event = context.pollOrWaitEvent(5);
                time++;
                if(event != null) { // no event
                    Action action = event.getAction();
                    if(action == Action.KEY_PRESSED) {

                        KeyboardKey key = event.getKey();

                        try {
                            // Player
                            if(key == KeyboardKey.RIGHT) 
                                player1.getPlayer().changeDirection(Go_To.RIGHT, flag);
                            
                            if(key == KeyboardKey.LEFT) 
                                player1.getPlayer().changeDirection(Go_To.LEFT, flag);

                            // Exit
                            if(key == KeyboardKey.E) {
                                context.exit(0);
                                return;
                            }
                        } 
                        catch(IllegalAccessException e) {
                            e.printStackTrace();
                            context.exit(-1);
                            return;
                        }
                        flag = true;
                    } else if(action == Action.KEY_RELEASED)
                        flag = false;
                }

                if(time >= 5) {
                    try {
                        if(player1.isAlive())
                            player1.getPlayer().move(add, erase);
                    } 
                    catch(CollisionException e) {
                        player1.kill();

                        try {
                            Thread.sleep(2000);
                        } 
                        catch(InterruptedException e1) {
                            e1.printStackTrace();
                        }
                        context.exit(0);
                        return;
                    } 
                    catch(Exception e) {
                        e.printStackTrace();
                        context.exit(-1);
                        return;
                    }

                    time = 0;
                }

                erase.forEach(Draw::undraw);
                erase.clear();

                Draw.draw(player1.getPlayer().getQueue(), player1.getColor());

                add.forEach(rectangularShape -> Draw.draw(rectangularShape, player1.getColor()));
                add.clear();

                Draw.drawBonus(bonusListInGame.random());


                Snake.decrementAll();
            }
        });
    }
}

