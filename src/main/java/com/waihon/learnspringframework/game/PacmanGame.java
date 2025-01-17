package com.waihon.learnspringframework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class PacmanGame implements GamingConsole {

    public void up() {
        System.out.println("PacmanGame Up");
    }

    public void down() {
        System.out.println("PacmanGame Down");
    }

    public void left() {
        System.out.println("PacmanGame Left");
    }

    public void right() {
        System.out.println("Pacman Right");
    }
}
