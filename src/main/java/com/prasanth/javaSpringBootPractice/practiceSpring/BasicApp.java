package com.prasanth.javaSpringBootPractice.practiceSpring;

import com.prasanth.javaSpringBootPractice.practiceSpring.level1.game.GameRunner;
import com.prasanth.javaSpringBootPractice.practiceSpring.level1.game.GamingConsole;
import com.prasanth.javaSpringBootPractice.practiceSpring.level1.game.PacMan;
import com.prasanth.javaSpringBootPractice.practiceSpring.level1.game.Mario;

public class BasicApp {
    public static void main(String[] args) {

        GamingConsole game = new PacMan();
        //GamingConsole game = new Mario();
        GameRunner console = new GameRunner(game);

        console.run();
    }
}
