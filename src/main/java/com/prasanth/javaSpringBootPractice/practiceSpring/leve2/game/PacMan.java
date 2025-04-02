package com.prasanth.javaSpringBootPractice.practiceSpring.leve2.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("PacMan")
public class PacMan implements GamingConsole {

private static final String name= "PacMan";
    @Override
    public String getGameName() {
        return "Running " + name;
    }

    @Override
    public void up() {
        System.out.println("Move UP");
    }

    @Override
    public void down() {
        System.out.println("Move Down");
    }

    @Override
    public void left() {
        System.out.println("Move back");
    }

    @Override
    public void right() {
        System.out.println("Move Forward");
    }
}
