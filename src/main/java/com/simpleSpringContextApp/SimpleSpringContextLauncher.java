package com.simpleSpringContextApp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;


@Configuration
@ComponentScan("com.in28minutes_learn_spring_framework.dependencyInjection")
public class SimpleSpringContextLauncher {

    public static void main(String[] args) {

        try (var context = new AnnotationConfigApplicationContext(SimpleSpringContextLauncher.class)) {

            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }
    }
}

