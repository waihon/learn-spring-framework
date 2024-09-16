package com.waihon.learnspringframework.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {

    // @Autowired is optional when using constructor-based dependency injection
    private GamingConsole game;

    // Constructor-based dependency injection - recommended among 3 types of injection
    public GameRunner(GamingConsole game) {
        this.game = game;
    }

    public void run() {
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
