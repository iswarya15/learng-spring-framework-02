package com.in28minutes.learn_spring_framework.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.in28minutes.learn_spring_framework.game")
public class ApplicationMain {

    @Bean
    public GameRunner game(GamingConsole game) {
        var gameRunner = new GameRunner(game);
        gameRunner.run();
        return gameRunner;
    }

    public static void main(String[] args) {

        try (var context = new AnnotationConfigApplicationContext(ApplicationMain.class)) {
            context.getBean(BatmanGame.class);
        }

    }
}
