package com.prasanth.javaSpringBootPractice.practiceSpring.leve2.game;

import org.springframework.stereotype.Component;

@Component
public interface GamingConsole {
    public String getGameName();
    public void up();
    public void down();
    public void left();
    public void right();
}
