package com.SpringBoot.PracticePrograms;

import com.SpringBoot.GamePrograms.GameB;
import com.SpringBoot.GamePrograms.GamesInterface;
import com.SpringBoot.GamePrograms.MarioGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GammerClass {
    @Bean
    public GamesInterface game(){
        GamesInterface game = new GameB();
        return game;
    }
    @Bean
    public GammerClassDriver gameDriver(GamesInterface game){
        GammerClassDriver gameDriver = new GammerClassDriver(game);
        return gameDriver;
    }
}
