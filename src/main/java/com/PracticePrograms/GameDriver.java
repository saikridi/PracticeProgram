package com.PracticePrograms;

import com.PracticePrograms.Games.GameA;
import com.PracticePrograms.Games.GameB;
import com.PracticePrograms.Games.GameInterface;

public class GameDriver {
    public static void main(String[] args){
        GameInterface game = new GameB();
        System.out.println(game);

        GameFunctionality fun = new GameFunctionality(game);
        fun.run();
    }
}
