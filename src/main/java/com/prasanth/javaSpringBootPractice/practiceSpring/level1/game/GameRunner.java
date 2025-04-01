package com.prasanth.javaSpringBootPractice.practiceSpring.level1.game;

public class GameRunner {
    private GamingConsole game;
    public GameRunner(GamingConsole game){
        this.game=game;
    }
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
