package com.PracticePrograms.Games;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class GameApplication {
    public static void main(String[] args){
        try(var context = new AnnotationConfigApplicationContext(GameApplication.class)){
            context.getBean(GameInterface.class).Up();
            context.getBean(GameFunctionality.class).run();
        }
    }
}
