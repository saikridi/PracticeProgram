package com.SpringBoot.PracticePrograms;

import com.SpringBoot.GamePrograms.GamesInterface;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GammerClassDriver {
    private GamesInterface game;
    public GammerClassDriver(GamesInterface game){
        this.game = game;
    }
    @Bean
    public void run(){
        game.Up();
        game.Down();
        game.Left();
        game.Right();
    }
}
