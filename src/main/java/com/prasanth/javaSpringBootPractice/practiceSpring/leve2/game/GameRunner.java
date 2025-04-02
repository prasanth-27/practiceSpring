package com.prasanth.javaSpringBootPractice.practiceSpring.leve2.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {

    /*@Autowired
    //private GamingConsole game; // autowired to Mario as primary
    private @Qualifier("PacMan")GamingConsole game; //autowired to PacMan due to qualifier spec*/

   private GamingConsole game;

   @Autowired
   public GameRunner(GamingConsole game){
        this.game = game;
    } // This is constructor injection

    /*@Autowired // setter Injection
    public void setGame(GamingConsole game) {
        this.game = game;
    }

    public GamingConsole getGame() {
        return game;
    }*/

    public void run() {
        System.out.println("Initializing Gaming Console....");
        game.getGameName();
        game.up();
        game.down();
        game.left();
        game.right();
        System.out.println("Game Over!");
    }
}
