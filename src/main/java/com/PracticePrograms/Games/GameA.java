package com.PracticePrograms.Games;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class GameA implements GameInterface{
    public void Up(){System.out.println("Go Game A Up");}
    public void Down(){System.out.println("Go Game A Down");}
    public void Left(){System.out.println("Go Game A Left");}
    public void Right(){System.out.println("Go Game A Right");}
}
