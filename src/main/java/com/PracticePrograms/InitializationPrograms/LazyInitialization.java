package com.PracticePrograms.InitializationPrograms;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy(value = false)
class ClassA{
    public ClassA(){
        System.out.println("Called Class A");
    }

}
@Component
@Lazy()
class ClassB{
    private final ClassA classA;
    public ClassB(ClassA classA){
        // Logic todo
        System.out.println("Called Class B");
        this.classA = classA;
    }
    public String Name(){
        return "Saikrishna";
    }
}
@Configuration
@ComponentScan
public class LazyInitialization {
    public static void main(String[] args){
        try(var context = new AnnotationConfigApplicationContext(LazyInitialization.class)){
            //Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(context.getBean(ClassB.class).Name());
        }
    }
}
