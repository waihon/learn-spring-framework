package com.waihon.learnspringframework.game;

import org.springframework.stereotype.Component;

//@Component
public class SuperContraGame implements GamingConsole {

    public void up() {
        System.out.println("SuperContraGame Up");
    }

    public void down() {
        System.out.println("SuperContraGame Down");
    }

    public void left() {
        System.out.println("SuperContraGame Left");
    }

    public void right() {
        System.out.println("SuperContraGame Right");
    }
}
