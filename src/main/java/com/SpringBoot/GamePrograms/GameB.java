package com.SpringBoot.GamePrograms;

import org.springframework.stereotype.Component;

@Component
public class GameB implements GamesInterface{
    public void Up(){System.out.println("Fly");}
    public void Down(){
        System.out.println("Dive");
    }
    public void Right(){
        System.out.println("Shoot");
    }
    public void Left(){
        System.out.println("Run Back");
    }
}
