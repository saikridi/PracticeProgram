package com.SpringBoot.PracticePrograms;

import com.SpringBoot.GamePrograms.GamesInterface;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationConfigGameRunner {
    public static void main(String[] args){
        try(var context =
                    new AnnotationConfigApplicationContext(GammerClass.class)) {
            /* Here are the examples of the Spring Bean.*/
            context.getBean(GamesInterface.class).Up();
            context.getBean(GammerClassDriver.class).run();

        }
    }
}
