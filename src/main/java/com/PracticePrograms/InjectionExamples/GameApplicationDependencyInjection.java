package com.PracticePrograms.InjectionExamples;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class GameApplicationDependencyInjection {
    public static void main(String[] args){
        try(var context = new AnnotationConfigApplicationContext(com.PracticePrograms.Games.GameApplication.class)){
            Arrays.asList(context.getBeanDefinitionNames())
                    .forEach(System.out::println);
        }
    }
}
