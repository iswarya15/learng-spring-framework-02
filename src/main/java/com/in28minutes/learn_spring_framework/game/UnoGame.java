package com.in28minutes.learn_spring_framework.game;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("UnoGameQualifier")
public class UnoGame implements GamingConsole{

    public void name() {
        System.out.println("My name is Uno!!!");
    }

    public void up() {
        System.out.println("Up");
    }
    public void down() {
        System.out.println("Down");
    }
    public void left() {
        System.out.println("Left");
    }
    public void right() {
        System.out.println("Right");
    }
}
