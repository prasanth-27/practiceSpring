package com.prasanth.javaSpringBootPractice.practiceSpring.level1.game;

public class Mario implements GamingConsole{

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
