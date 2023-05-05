package com.PracticePrograms;

import com.PracticePrograms.Games.GameB;
import com.PracticePrograms.Games.GameInterface;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GameApplication {
    @Bean
    public GameInterface game(){
        return new GameB();
    }
    @Bean
    public GameFunctionality CallGameFunctionality(GameInterface game){
        return new GameFunctionality(game);
    }
    public static void main(String[] args){
        try(var context = new AnnotationConfigApplicationContext(GameApplication.class)){
            context.getBean(GameInterface.class).Up();
            context.getBean(GameFunctionality.class).run();
        }
    }
}
