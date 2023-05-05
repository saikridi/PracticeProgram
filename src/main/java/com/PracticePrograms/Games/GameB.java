package com.PracticePrograms.Games;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("GameBQualifier")
public class GameB implements GameInterface{
    public void Up(){System.out.println("Go Game B Up");}
    public void Down(){System.out.println("Go Game B Down");}
    public void Left(){System.out.println("Go Game B Left");}
    public void Right(){System.out.println("Go Game B Right");}
}
