package com.PracticePrograms.InjectionExample1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.Arrays;

@Component
class BusinessClass{
    @Autowired
    Dependency1 dependency1;
    @Autowired
    Dependency2 dependency2;

    public String toString(){
        return "Using " + dependency1 + " and " + dependency2;
    }
}

@Component
class Dependency1{

}

@Component
class Dependency2{

}

@Configuration
@ComponentScan
public class GameApplicationDependencyInjection1 {
    public static void main(String[] args){
        try(var context = new AnnotationConfigApplicationContext(GameApplicationDependencyInjection1.class)){
            Arrays.asList(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(context.getBean(BusinessClass.class).toString());
        }
    }
}
