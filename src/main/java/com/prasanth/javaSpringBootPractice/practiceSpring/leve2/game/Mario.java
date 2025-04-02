package com.prasanth.javaSpringBootPractice.practiceSpring.leve2.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Mario implements GamingConsole {

private static final String name= "Mario";
    @Override
    public String getGameName() {
        return "Running " + name;
    }

    @Override
    public void up() {
        System.out.println("Jump");
    }

    @Override
    public void down() {
        System.out.println("Duck in");

    }

    @Override
    public void left() {
        System.out.println("move back");
    }

    @Override
    public void right() {
        System.out.println("Move Forward");
    }
}
