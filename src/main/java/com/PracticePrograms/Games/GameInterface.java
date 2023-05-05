package com.PracticePrograms.Games;

import org.springframework.stereotype.Component;

@Component
public interface GameInterface {
    void Up();
    void Down();
    void Left();
    void Right();
}
