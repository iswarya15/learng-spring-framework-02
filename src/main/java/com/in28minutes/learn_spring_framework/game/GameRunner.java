package com.in28minutes.learn_spring_framework.game;

public class GameRunner {

    GamingConsole game;

    public GameRunner(GamingConsole game) {
        this.game = game;
    }

     public void run() {
        game.name();
     }
}
