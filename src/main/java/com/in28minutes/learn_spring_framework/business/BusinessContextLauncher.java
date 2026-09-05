package com.in28minutes.learn_spring_framework.business;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BusinessContextLauncher {

  public static void main(String[] args) {
      try (var context = new AnnotationConfigApplicationContext()) {

      }
  }
}
