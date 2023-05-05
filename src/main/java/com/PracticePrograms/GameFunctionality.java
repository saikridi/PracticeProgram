package com.PracticePrograms;

import com.PracticePrograms.Games.GameInterface;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameFunctionality {
    /* Contains the Basic Functionality of the game*/
    private GameInterface game;
    public GameFunctionality(GameInterface game){this.game = game;}

    public void run(){
        game.Up();
        game.Down();
        game.Left();
        game.Right();
    }

}
