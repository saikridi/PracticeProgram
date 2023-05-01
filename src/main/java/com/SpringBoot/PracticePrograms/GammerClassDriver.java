package com.SpringBoot.PracticePrograms;

import com.SpringBoot.GamePrograms.GamesInterface;
import com.SpringBoot.GamePrograms.MarioGame;

public class GammerClassDriver {
    private GamesInterface game;

    public GammerClassDriver(GamesInterface game){
        this.game = game;
    }

    public void run(){
        game.Up();
        game.Down();
        game.Left();
        game.Right();
    }
}
