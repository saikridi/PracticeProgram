package com.SpringBoot.PracticePrograms;

import com.SpringBoot.GamePrograms.GameB;
import com.SpringBoot.GamePrograms.MarioGame;

public class GammerClass {
    public static void main(String[] args){

        var game = new MarioGame();
        var gameDriver = new GammerClassDriver(game);

        gameDriver.run();
    }
}
